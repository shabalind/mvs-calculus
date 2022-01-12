  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    double v10 = v2;
    double v23 = v2;
    const std::vector<double> v9 = v3[0];
    const double v24 = v9[0];
    v10 = v24;
    const std::vector<double> v49 { v24, v10, v2, v10, v10 };
    std::vector<double> v35 = v49;
    v10 = v24;
    const double v36 = v9[0];
    std::vector<double> v67 = v35;
    double v34 = v36;
    double v29 = v36;
    const double v55 = v29 + v10;
    double v44 = v34;
    v35[2] = v44;
    const double v64 = v49[3];
    v67[1] = v55;
    v67[1] = v23;
    const double v93 = v67[2];
    v35[2] = v64;
    return v93;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s0 v1({ { { 2.0 } }, { { 3.0 } } });
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
