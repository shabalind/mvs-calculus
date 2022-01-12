  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    std::vector<std::vector<double>> p1;
    s5(s3 v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f8(const double &v0) {
    double v5 = v0;
    v5 = v0;
    const double v4 = v0 / v5;
    double v3 = v4;
    double v7 = v3;
    double v23 = v4;
    double v2 = v23;
    double v6 = v4;
    double v10 = v4;
    double v11 = v3;
    double v16 = v23;
    double v18 = v10;
    const double v13 = v2 * v6;
    double v17 = v13;
    v17 = v16;
    double v21 = v11;
    double v37 = v4;
    const double v39 = v3 + v6;
    double v31 = v7;
    v6 = v21;
    double v45 = v39;
    double v32 = v5;
    double v60 = v0;
    v11 = v3;
    double v65 = v16;
    const std::vector<double> v58 { v2, v60, v65 };
    std::vector<double> v26 = v58;
    v26[0] = v3;
    v26[2] = v31;
    v26[2] = v32;
    v26[1] = v45;
    v26[2] = v37;
    v26[1] = v18;
    std::vector<double> v51 = v26;
    v26[2] = v17;
    v26[1] = v17;
    v26[1] = v17;
    const double v81 = v51[0];
    v26[2] = v17;
    return v81;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    double v5 = v1;
    const double v4 = f8(v1);
    const double v3 = f8(v4);
    const double v37 = f8(v3);
    const double v45 = v5 - v37;
    return v45;
  }
  int main() {
    std::vector<s5> v0({ { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { 4.0 }, { 5.0 }, { 6.0 } } }, { { { { { 7.0 } }, { { 8.0 } } }, { { { 9.0 } }, { { 10.0 } } } }, { { 11.0 }, { 12.0 }, { 13.0 } } } });
    double v1(14.0);
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
