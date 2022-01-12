  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s2(s0 v0): p0(v0) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f30(const s2 &v0, const double &v1) {
    const std::vector<double> v6 { v1, v1, v1 };
    std::vector<double> v7 = v6;
    const double v3 = v6[2];
    const double v12 = v7[0];
    v7[2] = v12;
    v7[2] = v3;
    const double v11 = v7[0];
    v7 = v6;
    v7[1] = v11;
    double v28 = v1;
    const double v33 = v6[1];
    v28 = v33;
    const double v61 = v11 + v12;
    v28 = v33;
    const double v77 = v28 + v61;
    v7[0] = v61;
    return v77;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const double v2 = v1 + v1;
    const s2 v11 = v0.p1;
    double v4 = v2;
    const s0 v7 = v11.p0;
    const std::vector<std::vector<double>> v21 = v7.p0;
    const double v9 = f30(v11, v2);
    const std::vector<double> v12 = v21[0];
    v4 = v9;
    std::vector<double> v22 = v12;
    const double v17 = v22[0];
    v22[0] = v1;
    double v29 = v17;
    v22[0] = v4;
    return v29;
  }
  int main() {
    s3 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } });
    double v1(6.0);
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
