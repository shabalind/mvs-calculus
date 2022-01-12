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
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    s3(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const std::vector<s1> v2 = v0.p0;
    const s1 v3 = v2[0];
    const std::vector<s0> v7 = v3.p0;
    const s0 v11 = v7[0];
    const s0 v12 = v7[0];
    const std::vector<std::vector<double>> v18 = v11.p1;
    double v43 = v1;
    const std::vector<double> v34 = v18[0];
    const std::vector<std::vector<double>> v14 = v12.p0;
    const double v60 = v43 - v43;
    const std::vector<std::vector<std::vector<double>>> v58 { v14, v14, v14, v14, v14, v14 };
    const std::vector<std::vector<double>> v61 = v58[2];
    double v36 = v60;
    const double v56 = v34[0];
    const std::vector<double> v53 = v61[1];
    v43 = v56;
    v43 = v36;
    const double v180 = v53[0];
    const double v112 = v60 + v180;
    return v112;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } });
    double v1(24.0);
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
