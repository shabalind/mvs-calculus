  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const double &v0) {
    double v1 = v0;
    double v5 = v1;
    const std::vector<double> v3 { v1, v5, v1, v0, v5, v1, v0 };
    v1 = v5;
    const double v6 = v3[3];
    const double v2 = v3[1];
    const double v10 = v3[3];
    double v8 = v10;
    std::vector<double> v7 = v3;
    double v18 = v8;
    double v23 = v18;
    v7[1] = v1;
    v7[3] = v23;
    v7[0] = v2;
    v7[5] = v6;
    const double v38 = v7[0];
    std::vector<double> v36 = v3;
    v36[0] = v38;
    const double v79 = v36[2];
    return v79;
  }
  int main() {
    double v0(0.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
