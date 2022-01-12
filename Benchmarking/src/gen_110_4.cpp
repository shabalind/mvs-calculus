  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<double> p0;
    double p1;
    s2(std::vector<double> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s3> p0;
    s2 p1;
    s6(std::vector<s3> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s3 f6(const s3 &v0) {
    s3 v4 = v0;
    s3 v5 = v4;
    s3 v2 = v5;
    s3 v7 = v0;
    const s0 v1 = v7.p1;
    v4.p1 = v1;
    s0 v10 = v1;
    const std::vector<std::vector<double>> v8 = v10.p0;
    v5.p1 = v1;
    const std::vector<std::vector<double>> v12 = v1.p1;
    const s2 v11 = v5.p0;
    s0 v6 = v10;
    v4.p1 = v6;
    const std::vector<double> v14 = v12[0];
    const std::vector<std::vector<double>> v3 = v1.p1;
    std::vector<std::vector<double>> v26 = v12;
    v6.p1 = v12;
    v5.p0 = v11;
    std::vector<std::vector<double>> v20 = v8;
    v6.p1 = v12;
    const std::vector<double> v15 = v26[0];
    const std::vector<std::vector<double>> v24 = v10.p1;
    const std::vector<double> v28 = v8[1];
    s3 v16 = v4;
    v6.p0 = v20;
    v26[0] = v28;
    const std::vector<double> v9 = v8[0];
    const std::vector<std::vector<std::vector<double>>> v27 { v12, v3, v26, v26 };
    const std::vector<std::vector<double>> v21 = v6.p1;
    v20[1] = v15;
    const s2 v38 = v5.p0;
    const s2 v37 = v0.p0;
    const std::vector<double> v35 = v37.p0;
    s3 v36 = v5;
    const std::vector<double> v39 = v37.p0;
    v5.p0 = v38;
    v20[1] = v35;
    v4.p1 = v10;
    const std::vector<std::vector<double>> v63 = v27[3];
    v26[0] = v28;
    const std::vector<std::vector<double>> v133 = v27[3];
    v7.p1 = v6;
    v36.p1 = v1;
    const std::vector<double> v75 = v20[1];
    v20[1] = v9;
    v7 = v2;
    const std::vector<std::vector<std::vector<double>>> v52 { v8, v20, v8, v20, v20, v20 };
    const std::vector<std::vector<double>> v49 = v10.p0;
    s0 v124 = v1;
    const std::vector<std::vector<double>> v76 = v52[1];
    std::vector<std::vector<double>> v60 = v24;
    v124.p0 = v76;
    v20[1] = v35;
    s0 v176 = v6;
    v60[0] = v75;
    v124.p1 = v133;
    v10.p1 = v60;
    v4.p1 = v176;
    v124.p1 = v63;
    std::vector<std::vector<std::vector<double>>> v122 = v52;
    v124.p0 = v49;
    const std::vector<std::vector<double>> v123 = v10.p0;
    v6.p1 = v60;
    v26[0] = v39;
    v10.p1 = v21;
    const s2 v116 = v16.p0;
    const std::vector<std::vector<double>> v97 = v122[5];
    v122[3] = v123;
    v36.p1 = v124;
    v20[1] = v14;
    v7.p0 = v37;
    const s2 v200 = v7.p0;
    v2.p0 = v200;
    v7.p1 = v176;
    v2.p0 = v116;
    v6.p0 = v97;
    return v36;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v6 = v0[1];
    const s3 v7 = f6(v6);
    std::vector<s3> v20 = v0;
    const s2 v30 = v7.p0;
    v20[1] = v6;
    v20 = v0;
    const s6 v23(v20, v30);
    const std::vector<s6> v141 { v23, v23, v23, v23, v23, v23, v23 };
    const s6 v87 = v141[2];
    const s2 v108 = v87.p1;
    const double v139 = v108.p1;
    return v139;
  }
  int main() {
    std::vector<s3> v0({ { { { 0.0 }, 1.0 }, { { { 2.0 }, { 3.0 } }, { { 4.0 } } } }, { { { 5.0 }, 6.0 }, { { { 7.0 }, { 8.0 } }, { { 9.0 } } } }, { { { 10.0 }, 11.0 }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } });
    double v1(15.0);
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
