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
    s0 p0;
    std::vector<s1> p1;
    s2(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    std::vector<s2> p1;
    std::vector<s2> p2;
    s3(std::vector<s1> v0, std::vector<s2> v1, std::vector<s2> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    s4(std::vector<s1> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s1 f32(const s1 &v0) {
    s1 v4 = v0;
    s1 v1 = v0;
    s1 v5 = v1;
    const s0 v6 = v0.p0;
    v1.p0 = v6;
    const s0 v7 = v5.p1;
    v4.p0 = v7;
    v4.p1 = v6;
    const s0 v2 = v5.p1;
    const std::vector<std::vector<double>> v9 = v7.p1;
    s0 v22 = v2;
    v22.p1 = v9;
    v4.p1 = v22;
    v1.p1 = v6;
    v5.p0 = v2;
    v4 = v5;
    return v4;
  }
  s1 f28(const s1 &v0) {
    const s0 v3 = v0.p0;
    const s1 v1 = f32(v0);
    const s1 v4 = f32(v0);
    s1 v9 = v4;
    const s1 v8 = f32(v1);
    const s1 v7 = f32(v9);
    const s0 v5 = v7.p0;
    v9 = v4;
    s0 v24 = v5;
    const s1 v25(v3, v24);
    s0 v12 = v5;
    const s1 v38 = f32(v8);
    const s1 v19(v12, v12);
    const s0 v46 = v4.p1;
    const std::vector<std::vector<double>> v39 = v12.p1;
    const s1 v34 = f32(v38);
    const s1 v33 = f32(v34);
    const s0 v52 = v8.p0;
    const s1 v55 = f32(v8);
    const s1 v59 = f32(v19);
    const s0 v69 = v8.p0;
    v12.p1 = v39;
    const std::vector<std::vector<double>> v60 = v69.p0;
    s1 v64 = v25;
    v24 = v46;
    v24.p0 = v60;
    v9.p0 = v5;
    const s0 v224 = v33.p1;
    v9.p1 = v224;
    v64.p0 = v24;
    v12 = v69;
    const s1 v114 = f32(v55);
    v64.p1 = v52;
    const s0 v81 = v59.p0;
    const s0 v175 = v114.p0;
    v9.p0 = v81;
    const s0 v156 = v9.p0;
    v9.p1 = v69;
    v9.p0 = v156;
    v64.p1 = v175;
    return v64;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v6 = v0[0];
    s3 v4 = v6;
    s3 v2 = v6;
    const s3 v3 = v0[0];
    const s3 v10 = v0[0];
    const s3 v27 = v0[0];
    const std::vector<s1> v19 = v4.p0;
    const s1 v17 = v19[1];
    const std::vector<s2> v28 = v3.p1;
    v4.p0 = v19;
    const std::vector<s2> v23 = v10.p1;
    const s0 v25 = v17.p1;
    const s1 v20 = f28(v17);
    const s1 v57 = f32(v20);
    v4.p1 = v23;
    v4.p1 = v23;
    const s2 v62 = v28[0];
    const std::vector<std::vector<double>> v85 = v25.p0;
    const std::vector<s1> v41 = v62.p1;
    const std::vector<s2> v94 = v27.p1;
    s3 v60 = v2;
    const std::vector<double> v140 = v85[1];
    std::vector<s1> v164 = v41;
    const s4 v92(v164, v19);
    s4 v133 = v92;
    const std::vector<s1> v131 = v60.p0;
    const std::vector<s1> v90 = v133.p1;
    v2.p1 = v94;
    const double v75 = v140[0];
    v4.p0 = v90;
    v164[0] = v57;
    v4.p0 = v131;
    return v75;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } } } } }, { { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } } } } } } });
    double v1(65.0);
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
