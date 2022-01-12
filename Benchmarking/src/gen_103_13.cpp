  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f26(const double &v0) {
    double v3 = v0;
    double v1 = v0;
    const std::vector<double> v9 { v0, v1, v3, v1, v0, v1, v1 };
    const double v7 = v9[2];
    const double v4 = v9[6];
    std::vector<double> v6 = v9;
    v6[0] = v1;
    v3 = v4;
    const double v15 = v6[5];
    v1 = v15;
    std::vector<double> v2 = v6;
    v6[3] = v7;
    const double v11 = v6[4];
    v2[1] = v0;
    const double v17 = v9[5];
    v6[2] = v4;
    v6 = v9;
    std::vector<double> v34 = v2;
    double v61 = v11;
    std::vector<double> v21 = v34;
    const double v27 = v9[6];
    v21[3] = v27;
    v34 = v2;
    const double v79 = v21[2];
    std::vector<double> v49 = v6;
    v2[6] = v61;
    v2 = v49;
    v6[1] = v17;
    return v79;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const double v2 = f26(v1);
    const double v6 = f26(v2);
    return v6;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    double v1(8.0);
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
