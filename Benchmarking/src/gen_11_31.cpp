  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<double> v5 = v2[0];
    const std::vector<double> v7 = v2[1];
    const double v10 = v7[0];
    const double v9 = v5[0];
    double v19 = v10;
    v19 = v10;
    const std::vector<double> v70 { v3, v3, v19, v9 };
    const std::vector<std::vector<double>> v16 { v70, v70, v70 };
    const std::vector<double> v44 = v2[1];
    const std::vector<double> v37 = v16[2];
    const double v152 = v37[2];
    const double v108 = v44[0];
    const double v124 = v108 * v152;
    double v137 = v124;
    return v137;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 }, { 3.0 } });
    std::vector<std::vector<double>> v2({ { 4.0 }, { 5.0 } });
    double v3(6.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
