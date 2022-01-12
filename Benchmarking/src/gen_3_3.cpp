  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    double p0;
    s1 p1;
    s3(double v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v13 = v1.p1;
    double v12 = v2;
    const std::vector<double> v14 = v13[0];
    std::vector<double> v23 = v14;
    const double v10 = v14[0];
    double v28 = v12;
    const double v15 = v23[0];
    v23[0] = v12;
    v23[0] = v28;
    v23[0] = v15;
    double v20 = v15;
    const double v51 = v23[0];
    double v32 = v51;
    v23[0] = v10;
    double v75 = v32;
    v23[0] = v20;
    return v75;
  }
  int main() {
    s3 v0({ 0.0, { { { { { 1.0 } }, { { 2.0 } } }, { { { 3.0 } }, { { 4.0 } } } }, { { { 5.0 } }, { { 6.0 } } } } });
    s0 v1({ { { 7.0 } }, { { 8.0 } } });
    double v2(9.0);
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
