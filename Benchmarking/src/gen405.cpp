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
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f65(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<s0> v4 { v0, v0, v0, v0 };
    const s0 v13 = v4[2];
    const std::vector<std::vector<double>> v17 = v0.p0;
    const s0 v12 = v4[3];
    const std::vector<std::vector<double>> v24 = v13.p1;
    s0 v19 = v12;
    const std::vector<std::vector<double>> v50 = v19.p1;
    v19.p1 = v50;
    const std::vector<std::vector<double>> v47 = v19.p0;
    v19.p1 = v6;
    v19.p1 = v24;
    v19.p1 = v6;
    v19.p0 = v47;
    v19.p0 = v8;
    const s1 v67(v19, v13);
    s1 v131 = v67;
    const s0 v80 = v4[1];
    s1 v87 = v131;
    v131.p1 = v80;
    v19.p0 = v17;
    const s0 v180 = v87.p0;
    return v180;
  }
  s2 f41(const s2 &v0) {
    s2 v5 = v0;
    const s1 v6 = v5.p1;
    const s1 v3 = v5.p1;
    v5.p1 = v6;
    v5 = v0;
    const s1 v4 = v5.p1;
    v5.p1 = v6;
    v5.p1 = v4;
    const std::vector<s1> v11 = v0.p0;
    v5.p1 = v6;
    s1 v40 = v4;
    v5 = v0;
    const s0 v62 = v3.p0;
    v40.p0 = v62;
    const s2 v83(v11, v40);
    return v83;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    double v8 = v1;
    s2 v2 = v0;
    double v5 = v8;
    const double v9 = v5 - v8;
    const std::vector<s1> v6 = v2.p0;
    const s1 v10 = v6[1];
    const s0 v11 = v10.p0;
    const s0 v19 = f65(v11);
    const std::vector<std::vector<double>> v25 = v19.p0;
    const s2 v18 = f41(v0);
    const s1 v23 = v18.p1;
    double v36 = v9;
    const std::vector<double> v39 = v25[0];
    std::vector<double> v16 = v39;
    v2.p0 = v6;
    const double v24 = v16[0];
    v16[0] = v36;
    v2.p1 = v23;
    v2.p1 = v10;
    return v24;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } });
    double v1(40.0);
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
