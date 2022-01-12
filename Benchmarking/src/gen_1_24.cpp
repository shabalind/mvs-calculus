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
    s0 p2;
    s1(s0 v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s2(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    std::vector<std::vector<s3>> p1;
    s5(std::vector<s2> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const std::vector<s5> &v1, const double &v2) {
    const std::vector<s3> v3 = v0[1];
    const s3 v6 = v3[0];
    const s0 v16 = v6.p1;
    const s0 v11 = v6.p1;
    const std::vector<std::vector<double>> v21 = v11.p1;
    std::vector<std::vector<double>> v36 = v21;
    const std::vector<double> v25 = v36[0];
    const std::vector<std::vector<double>> v30 = v16.p1;
    v36[0] = v25;
    const std::vector<double> v49 = v36[0];
    v36[0] = v49;
    const double v33 = v49[0];
    double v59 = v33;
    const std::vector<double> v56 = v30[0];
    const double v73 = v25[0];
    v36[0] = v56;
    const double v110 = v73 * v59;
    const double v157 = v73 + v110;
    return v157;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { 14.0 } }, { { 15.0 } } } } } });
    std::vector<s5> v1({ { { { { { { 16.0 } }, { { 17.0 } } }, { { { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } } } } } }, { { { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } }, { { { 28.0 } }, { { 29.0 } } } } }, { { { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } }, { { { 34.0 } }, { { 35.0 } } } }, { { { 36.0 } }, { { 37.0 } } } } } } }, { { { { { { 38.0 } }, { { 39.0 } } }, { { { { { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 } }, { { 43.0 } } } } } } }, { { { { { { { 44.0 } }, { { 45.0 } } }, { { { 46.0 } }, { { 47.0 } } }, { { { 48.0 } }, { { 49.0 } } } }, { { { 50.0 } }, { { 51.0 } } } } }, { { { { { { 52.0 } }, { { 53.0 } } }, { { { 54.0 } }, { { 55.0 } } }, { { { 56.0 } }, { { 57.0 } } } }, { { { 58.0 } }, { { 59.0 } } } } } } } });
    double v2(60.0);
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
