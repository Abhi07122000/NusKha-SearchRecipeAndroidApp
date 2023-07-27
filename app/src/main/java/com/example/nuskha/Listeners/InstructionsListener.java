package com.example.nuskha.Listeners;

import com.example.nuskha.Models.InstructionResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionResponse> response, String message);
    void didError(String message);
}
