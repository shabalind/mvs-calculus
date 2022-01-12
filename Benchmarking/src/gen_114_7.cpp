  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v5 = v0;
    const s0 v4 = v5.p1;
    const std::vector<std::vector<double>> v2 = v4.p0;
    v5.p1 = v4;
    const s0 v3 = v5.p0;
    v5.p1 = v4;
    const std::vector<double> v9 = v2[2];
    v5.p1 = v3;
    v5 = v0;
    v5.p1 = v3;
    const double v20 = v9[0];
    return v20;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } } }, { { { 3.0 }, { 4.0 }, { 5.0 } } } });
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
