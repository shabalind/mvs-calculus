  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<double> v3 = v0[1];
    const double v5 = v3[0];
    const double v7 = v3[0];
    const double v10 = v3[0];
    const std::vector<double> v21 { v7, v7, v7, v7, v5, v10 };
    std::vector<double> v35 = v21;
    const double v20 = v21[0];
    v35[5] = v20;
    std::vector<double> v32 = v21;
    v32[1] = v7;
    std::vector<double> v31 = v32;
    std::vector<double> v180 = v31;
    v180 = v35;
    const double v98 = v180[0];
    return v98;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    double v1(3.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
