  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s3(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const s2 &v1, const s3 &v2, const double &v3) {
    const std::vector<double> v13 { v3 };
    const double v12 = v13[0];
    const s0 v36 = v1.p1;
    const std::vector<std::vector<double>> v11 = v36.p0;
    double v17 = v12;
    const double v16 = v13[0];
    const std::vector<double> v25 = v11[0];
    std::vector<double> v35 = v25;
    const double v39 = v35[0];
    double v100 = v17;
    const std::vector<double> v104 { v100, v16 };
    std::vector<double> v74 = v104;
    std::vector<double> v151 = v74;
    v151[0] = v39;
    const double v407 = v151[1];
    return v407;
  }
  int main() {
    s3 v0({ { { { { { 0.0 } } } }, { { { { 1.0 } } } } }, { { { { 2.0 } } }, { { { 3.0 } } } } });
    s2 v1({ { { { { { 4.0 } } } } }, { { { 5.0 } } } });
    s3 v2({ { { { { { 6.0 } } } }, { { { { 7.0 } } } } }, { { { { 8.0 } } }, { { { 9.0 } } } } });
    double v3(10.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
