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
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    s0 p1;
    s3(std::vector<std::vector<s2>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s3>> p1;
    s8(std::vector<std::vector<s0>> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  s2 f45(const s2 &v0) {
    const s0 v7 = v0.p1;
    const std::vector<std::vector<double>> v13 = v7.p1;
    const std::vector<std::vector<double>> v16 = v7.p0;
    const s0 v24(v16, v13);
    const std::vector<s0> v27 { v24, v24 };
    std::vector<s0> v80 = v27;
    const s0 v124 = v80[1];
    s2 v180 = v0;
    v180.p1 = v124;
    return v180;
  }
  s0 f43(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<s0> v2 { v0, v0, v0, v0 };
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v5.p1;
    std::vector<s0> v4 = v2;
    v5.p1 = v3;
    const s0 v8 = v4[3];
    std::vector<s0> v10 = v4;
    std::vector<s0> v11 = v2;
    std::vector<std::vector<double>> v6 = v3;
    std::vector<std::vector<double>> v12 = v6;
    const s0 v18 = v11[3];
    v11[2] = v8;
    const std::vector<std::vector<double>> v14 = v18.p0;
    const s0 v25 = v10[0];
    v4[2] = v25;
    v7.p0 = v14;
    std::vector<std::vector<double>> v22 = v3;
    std::vector<std::vector<double>> v23 = v14;
    std::vector<std::vector<double>> v21 = v23;
    const s0 v36 = v11[2];
    v7.p1 = v12;
    const std::vector<std::vector<double>> v20 = v36.p0;
    const std::vector<std::vector<double>> v40 = v25.p1;
    const std::vector<double> v51 = v21[0];
    v7.p0 = v20;
    std::vector<std::vector<double>> v38 = v20;
    v7.p1 = v12;
    std::vector<std::vector<double>> v31 = v6;
    const s2 v39(v18, v5);
    v4[3] = v5;
    s2 v71 = v39;
    const s2 v77 = f45(v39);
    v5.p0 = v38;
    v7.p1 = v31;
    const s0 v100 = v10[2];
    const s0 v29 = v77.p1;
    s2 v46 = v71;
    const s2 v64 = f45(v46);
    v71.p0 = v36;
    const s2 v70 = f45(v64);
    v5.p1 = v40;
    v71.p0 = v29;
    v71.p1 = v100;
    v12[0] = v51;
    const s0 v52 = v39.p1;
    v46.p0 = v100;
    v71.p1 = v52;
    const std::vector<std::vector<double>> v126 = v7.p0;
    v71.p1 = v5;
    v4[0] = v18;
    const s0 v239 = v70.p1;
    const std::vector<std::vector<double>> v170 = v239.p1;
    v6 = v170;
    v5.p1 = v22;
    v5.p0 = v126;
    return v239;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s8 &v1, const double &v2) {
    const s1 v4 = v0[0];
    const s0 v7 = v4.p0;
    double v9 = v2;
    const double v18 = v9 * v9;
    const std::vector<std::vector<double>> v19 = v7.p0;
    const s0 v59 = f43(v7);
    const std::vector<std::vector<double>> v20 = v59.p0;
    double v45 = v18;
    const std::vector<double> v28 = v19[0];
    const std::vector<double> v42 = v20[0];
    const double v26 = v28[0];
    std::vector<double> v48 = v28;
    v48[0] = v45;
    const double v39 = v26 + v9;
    const double v84 = v42[0];
    std::vector<double> v94 = v48;
    v48[0] = v84;
    v48[0] = v26;
    v48[0] = v84;
    v48[0] = v18;
    v94[0] = v39;
    const double v53 = v94[0];
    v48[0] = v2;
    return v53;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } });
    s8 v1({ { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { { { { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } } } } } });
    double v2(33.0);
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
