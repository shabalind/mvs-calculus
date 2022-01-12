  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f36(const s0 &v0, const s0 &v1) {
    s0 v6 = v0;
    s0 v3 = v6;
    const std::vector<std::vector<double>> v8 = v1.p0;
    v3.p0 = v8;
    return v3;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s0 v6 = v0.p0;
    const s0 v3 = f36(v6, v6);
    const std::vector<s0> v2 { v3, v3, v6, v3 };
    const s0 v9 = v2[3];
    const s0 v8 = v0.p0;
    const std::vector<std::vector<double>> v5 = v9.p2;
    s0 v18 = v8;
    v18.p2 = v5;
    const s0 v14 = v2[3];
    const std::vector<std::vector<double>> v22 = v18.p0;
    v18.p0 = v5;
    const std::vector<std::vector<double>> v60 = v14.p1;
    const s0 v90(v22, v60, v22);
    const s0 v49 = f36(v90, v6);
    const std::vector<std::vector<double>> v107 = v49.p2;
    std::vector<std::vector<double>> v58 = v107;
    const std::vector<double> v101 = v58[0];
    const double v171 = v101[0];
    return v171;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } } }, { { { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } } }, { { { 14.0 }, { 15.0 }, { 16.0 } }, { { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } } } } });
    double v1(21.0);
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
