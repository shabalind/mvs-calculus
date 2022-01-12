  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    const std::vector<s3> v5 = v0[0];
    const s3 v2 = v5[0];
    const s0 v7 = v2.p1;
    const std::vector<std::vector<double>> v4 = v7.p0;
    const s0 v10 = v2.p1;
    const std::vector<std::vector<double>> v19 = v10.p0;
    const s3 v13 = v5[0];
    const s0 v8 = v13.p0;
    const std::vector<std::vector<double>> v14 = v8.p1;
    const std::vector<std::vector<double>> v23 = v7.p2;
    const s0 v27(v19, v14, v4);
    const std::vector<std::vector<double>> v50 = v27.p0;
    const std::vector<std::vector<std::vector<double>>> v38 { v23, v19, v50 };
    const std::vector<std::vector<double>> v59 = v38[2];
    const std::vector<double> v122 = v59[1];
    const double v279 = v122[0];
    return v279;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } } }, { { { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } } } } } });
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
