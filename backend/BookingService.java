package backend;

import java.util.*;

public class BookingService {
    private Map<String, List<String>> bookings = new HashMap<>();
    private Set<String> availableRooms = new HashSet<>(Arrays.asList("101", "102", "103"));

    public boolean registerUser(String userId) {
        if (userId == null || userId.isEmpty()) return false;
        bookings.putIfAbsent(userId, new ArrayList<>());
        return true;
    }

    public boolean bookRoom(String userId, String roomId) {
        if (!availableRooms.contains(roomId) || !bookings.containsKey(userId)) return false;
        List<String> userBookings = bookings.get(userId);
        if (userBookings.contains(roomId)) return false;
        userBookings.add(roomId);
        availableRooms.remove(roomId);
        return true;
    }

    public List<String> getUserBookings(String userId) {
        return bookings.getOrDefault(userId, new ArrayList<>());
    }

    public Set<String> getAvailableRooms() {
        return new HashSet<>(availableRooms);
    }
}
