  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    double v6 = v1;
    double v2 = v6;
    double v4 = v2;
    std::vector<double> v3 = v0;
    v3[1] = v4;
    double v13 = v2;
    v3[1] = v13;
    v2 = v13;
    const double v10 = v3[1];
    double v9 = v1;
    std::vector<double> v19 = v0;
    v3 = v0;
    v3[1] = v1;
    v9 = v10;
    const double v63 = v2 - v9;
    v3[0] = v13;
    v3 = v19;
    v19[1] = v13;
    return v63;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0 });
    double v1(2.0);
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
