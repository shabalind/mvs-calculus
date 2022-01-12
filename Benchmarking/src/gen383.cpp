  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<s1> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s0> p1;
    s3(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s2 p1;
    s4(std::vector<s3> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s0 f11(const s0 &v0) {
    const s1 v3(v0);
    const s0 v7 = v3.p0;
    const std::vector<std::vector<double>> v11 = v0.p0;
    std::vector<std::vector<double>> v13 = v11;
    const std::vector<double> v1 = v13[0];
    v13[0] = v1;
    const double v9 = v1[0];
    double v6 = v9;
    v13[0] = v1;
    const std::vector<double> v16 = v7.p1;
    v13[0] = v1;
    v13[0] = v1;
    v13 = v11;
    std::vector<double> v31 = v1;
    std::vector<double> v69 = v31;
    std::vector<double> v24 = v16;
    const s0 v45(v13, v24);
    v13[0] = v69;
    v69[0] = v6;
    return v45;
  }
  std::vector<std::vector<s0>> f10(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v6 = v0;
    const std::vector<std::vector<std::vector<s0>>> v4 { v6, v6, v6, v6, v6, v0 };
    const std::vector<std::vector<s0>> v8 = v4[2];
    const std::vector<s0> v9 = v0[1];
    std::vector<std::vector<std::vector<s0>>> v3 = v4;
    v3[0] = v8;
    v6[1] = v9;
    const std::vector<std::vector<s0>> v111 = v3[5];
    const std::vector<s0> v51 = v8[0];
    std::vector<std::vector<s0>> v128 = v111;
    v128[1] = v51;
    return v128;
  }
  std::vector<s0> f6(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v5 { v0 };
    std::vector<std::vector<s0>> v4 = v5;
    v4[0] = v0;
    const std::vector<s0> v3 = v4[0];
    const std::vector<s0> v2 = v5[0];
    const std::vector<std::vector<std::vector<s0>>> v14 { v4, v4, v4, v5, v4, v5, v4 };
    v4[0] = v3;
    const std::vector<s0> v49 = v5[0];
    const std::vector<s0> v41 = v5[0];
    const std::vector<std::vector<s0>> v29 { v2, v3, v2, v49, v3, v49, v41 };
    const std::vector<std::vector<s0>> v31 = v14[5];
    const std::vector<s0> v47 = v29[1];
    v4 = v31;
    return v47;
  }
  s0 f3(const s3 &v0, const s0 &v1, const std::vector<std::vector<s0>> &v2) {
    const std::vector<std::vector<s0>> v6 = f10(v2);
    const std::vector<s0> v7 = v6[0];
    const s0 v4 = f11(v1);
    s3 v9 = v0;
    v9.p0 = v4;
    const s0 v13 = v7[0];
    const std::vector<double> v10 = v4.p1;
    const s0 v14 = f11(v13);
    std::vector<std::vector<s0>> v39 = v6;
    const std::vector<s0> v20 = v2[1];
    const s0 v43 = v9.p0;
    s0 v46 = v43;
    const std::vector<s0> v36 = v2[0];
    std::vector<std::vector<s0>> v40 = v39;
    v46.p1 = v10;
    v9.p0 = v14;
    const std::vector<std::vector<double>> v33 = v43.p0;
    const std::vector<s0> v42 = v40[1];
    v39[0] = v20;
    const std::vector<double> v65 = v46.p1;
    const s1 v107(v14);
    std::vector<s0> v35 = v36;
    const s0 v60 = v107.p0;
    v40[0] = v36;
    v39[1] = v35;
    const s0 v76 = v42[0];
    s0 v97 = v76;
    std::vector<double> v51 = v65;
    std::vector<double> v93 = v51;
    v9.p0 = v60;
    v97.p1 = v65;
    const std::vector<s0> v127 = v9.p1;
    v97.p1 = v93;
    v97.p0 = v33;
    v9.p1 = v127;
    return v97;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const double &v1) {
    const std::vector<s4> v7 = v0[2];
    const s4 v2 = v7[0];
    const s2 v12 = v2.p1;
    const std::vector<std::vector<s0>> v9 = v12.p0;
    const std::vector<s3> v10 = v2.p0;
    const s3 v18 = v10[1];
    std::vector<std::vector<s0>> v25 = v9;
    v25 = v9;
    const std::vector<s0> v49 = v18.p1;
    s3 v71 = v18;
    const std::vector<s0> v36 = f6(v49);
    const s0 v27 = v36[1];
    v71.p0 = v27;
    const s0 v61 = f3(v71, v27, v25);
    v71.p1 = v36;
    const std::vector<s0> v62 = f6(v49);
    const std::vector<s0> v57 = f6(v62);
    v71.p1 = v36;
    const std::vector<std::vector<double>> v195 = v61.p0;
    const std::vector<std::vector<s0>> v102 = f10(v25);
    v71.p1 = v36;
    const std::vector<s0> v133 = f6(v57);
    const std::vector<s0> v206 = v102[1];
    v25[1] = v206;
    const std::vector<double> v122 = v195[0];
    v71.p1 = v133;
    const double v132 = v122[0];
    return v132;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { { 0.0 } }, { 1.0, 2.0 } }, { { { { 3.0 } }, { 4.0, 5.0 } }, { { { 6.0 } }, { 7.0, 8.0 } } } }, { { { { 9.0 } }, { 10.0, 11.0 } }, { { { { 12.0 } }, { 13.0, 14.0 } }, { { { 15.0 } }, { 16.0, 17.0 } } } } }, { { { { { { 18.0 } }, { 19.0, 20.0 } } }, { { { { 21.0 } }, { 22.0, 23.0 } } } }, { { { { { 24.0 } }, { 25.0, 26.0 } } }, { { { { 27.0 } }, { 28.0, 29.0 } } }, { { { { 30.0 } }, { 31.0, 32.0 } } } } } } }, { { { { { { { 33.0 } }, { 34.0, 35.0 } }, { { { { 36.0 } }, { 37.0, 38.0 } }, { { { 39.0 } }, { 40.0, 41.0 } } } }, { { { { 42.0 } }, { 43.0, 44.0 } }, { { { { 45.0 } }, { 46.0, 47.0 } }, { { { 48.0 } }, { 49.0, 50.0 } } } } }, { { { { { { 51.0 } }, { 52.0, 53.0 } } }, { { { { 54.0 } }, { 55.0, 56.0 } } } }, { { { { { 57.0 } }, { 58.0, 59.0 } } }, { { { { 60.0 } }, { 61.0, 62.0 } } }, { { { { 63.0 } }, { 64.0, 65.0 } } } } } } }, { { { { { { { 66.0 } }, { 67.0, 68.0 } }, { { { { 69.0 } }, { 70.0, 71.0 } }, { { { 72.0 } }, { 73.0, 74.0 } } } }, { { { { 75.0 } }, { 76.0, 77.0 } }, { { { { 78.0 } }, { 79.0, 80.0 } }, { { { 81.0 } }, { 82.0, 83.0 } } } } }, { { { { { { 84.0 } }, { 85.0, 86.0 } } }, { { { { 87.0 } }, { 88.0, 89.0 } } } }, { { { { { 90.0 } }, { 91.0, 92.0 } } }, { { { { 93.0 } }, { 94.0, 95.0 } } }, { { { { 96.0 } }, { 97.0, 98.0 } } } } } } } });
    double v1(99.0);
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
