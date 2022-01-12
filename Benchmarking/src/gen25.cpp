  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    double v5 = v2;
    const double v8 = v2 + v5;
    const std::vector<double> v14 { v5, v8, v8, v5, v5, v5, v5 };
    const double v12 = v14[4];
    std::vector<double> v32 = v14;
    std::vector<double> v36 = v32;
    double v58 = v12;
    const double v73 = v36[5];
    v36[6] = v58;
    v36[6] = v5;
    return v73;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 }, { 3.0 } });
    double v2(4.0);
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
