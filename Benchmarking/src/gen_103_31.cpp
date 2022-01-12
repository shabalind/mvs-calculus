  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    double v4 = v2;
    double v5 = v4;
    v4 = v2;
    const double v22 = v4 + v5;
    const double v36 = v5 - v4;
    v5 = v4;
    double v27 = v22;
    double v83 = v2;
    const double v34 = v27 - v83;
    double v62 = v34;
    v62 = v36;
    return v62;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 } });
    double v2(3.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
