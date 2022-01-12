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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s1> p1;
    s3(s2 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s2> p0;
    s0 p1;
    s4(std::vector<s2> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    std::vector<s0> p1;
    s5(std::vector<s2> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f23(const s2 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v6 = v1.p1;
    const s0 v5 = v0.p1;
    std::vector<std::vector<double>> v8 = v6;
    const std::vector<std::vector<double>> v2 = v1.p0;
    std::vector<std::vector<double>> v9 = v8;
    s2 v3 = v0;
    const std::vector<double> v11 = v2[0];
    s0 v13 = v5;
    v9[0] = v11;
    v3.p1 = v5;
    s0 v17 = v13;
    v17.p0 = v2;
    const std::vector<s0> v23 = v0.p0;
    v13.p1 = v9;
    const std::vector<std::vector<double>> v15 = v13.p0;
    v3 = v0;
    v3.p0 = v23;
    v13.p1 = v15;
    const std::vector<std::vector<double>> v28 = v17.p1;
    std::vector<s0> v20 = v23;
    const s0 v21 = v3.p1;
    std::vector<s0> v16 = v23;
    std::vector<std::vector<double>> v19 = v28;
    s2 v36 = v3;
    v13.p0 = v6;
    s2 v70 = v36;
    const s0 v27 = v23[1];
    v17 = v27;
    const s0 v22 = v70.p1;
    v13.p0 = v8;
    const std::vector<std::vector<double>> v29 = v27.p1;
    v13.p1 = v29;
    std::vector<std::vector<double>> v79 = v15;
    const std::vector<s0> v65 = v70.p0;
    v70.p0 = v23;
    const std::vector<s0> v50 = v70.p0;
    const std::vector<s0> v33 = v70.p0;
    v17.p0 = v8;
    s2 v32 = v70;
    v3.p0 = v33;
    s0 v48 = v5;
    v16 = v23;
    v32.p0 = v20;
    v3.p0 = v16;
    v36.p1 = v13;
    s2 v105 = v32;
    v36.p1 = v21;
    v48.p0 = v19;
    v36.p1 = v22;
    s2 v86 = v70;
    v70.p0 = v16;
    const std::vector<s2> v185 { v105, v105, v86, v3, v86, v32, v70 };
    const s2 v167 = v185[6];
    const s0 v68 = v167.p1;
    const std::vector<s0> v128 = v0.p0;
    v17.p1 = v79;
    v32.p0 = v50;
    const std::vector<s0> v279 = v32.p0;
    v48.p1 = v9;
    v17.p1 = v19;
    v32.p0 = v279;
    v70.p0 = v65;
    v105.p0 = v128;
    v32.p1 = v48;
    v32.p0 = v23;
    return v68;
  }
  s4 f4(const s4 &v0) {
    s4 v3 = v0;
    const std::vector<s2> v6 = v0.p0;
    std::vector<s2> v8 = v6;
    const s2 v1 = v8[0];
    const s2 v2 = v6[0];
    const s0 v5 = v1.p1;
    v8[0] = v1;
    const s2 v9 = v8[0];
    v8 = v6;
    std::vector<s2> v11 = v8;
    const s0 v10 = f23(v2, v5);
    v11[0] = v2;
    const s2 v15 = v11[0];
    v11[0] = v1;
    s0 v12 = v5;
    v8[0] = v15;
    v11[0] = v2;
    const s0 v20 = v3.p1;
    const s0 v19 = v1.p1;
    v8[0] = v15;
    v11[0] = v15;
    v11[0] = v9;
    const s2 v31 = v11[0];
    const s0 v30 = f23(v31, v20);
    const s2 v16 = v8[0];
    const std::vector<s0> v36 { v20, v10, v12, v5, v30 };
    const std::vector<s0> v29 = v16.p0;
    s2 v46 = v16;
    v11[0] = v2;
    v11[0] = v15;
    v8[0] = v31;
    const s0 v41 = v36[3];
    const std::vector<std::vector<double>> v43 = v19.p0;
    const std::vector<double> v22 = v43[0];
    const s0 v59 = v46.p1;
    v8[0] = v2;
    const s4 v106(v8, v41);
    std::vector<std::vector<double>> v38 = v43;
    v38[0] = v22;
    v46.p0 = v29;
    v38[0] = v22;
    v38[0] = v22;
    v8[0] = v2;
    v3.p1 = v59;
    v12.p0 = v38;
    return v106;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const std::vector<s3> &v1, const std::vector<s5> &v2, const std::vector<s0> &v3, const double &v4) {
    const s4 v6 = v0[0];
    const s0 v8 = v3[1];
    s0 v5 = v8;
    const s4 v19 = f4(v6);
    const s0 v25 = v19.p1;
    const std::vector<s2> v11 = v19.p0;
    const s2 v26 = v11[0];
    const s0 v37 = f23(v26, v8);
    const s0 v45 = v26.p1;
    const s0 v44 = f23(v26, v8);
    const s2 v33(v3, v45);
    s2 v42 = v26;
    v42 = v26;
    const s0 v43 = f23(v42, v44);
    const std::vector<std::vector<double>> v61 = v43.p0;
    v5.p1 = v61;
    const std::vector<std::vector<double>> v39 = v37.p1;
    const std::vector<std::vector<double>> v85 = v25.p1;
    v5.p1 = v85;
    const s0 v99 = f23(v33, v5);
    const std::vector<double> v106 = v61[0];
    std::vector<double> v128 = v106;
    v42.p1 = v99;
    v42.p1 = v45;
    const double v86 = v128[0];
    v5.p1 = v39;
    return v86;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { 12.0 } }, { { 13.0 } } } } }, { { { 14.0 } }, { { 15.0 } } } }, { { { { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } } }, { { { 20.0 } }, { { 21.0 } } } } }, { { { 22.0 } }, { { 23.0 } } } } });
    std::vector<s3> v1({ { { { { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } }, { { { 28.0 } }, { { 29.0 } } } }, { { { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } }, { { { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } } } }, { { { { { 40.0 } }, { { 41.0 } } }, { { { 42.0 } }, { { 43.0 } } }, { { { 44.0 } }, { { 45.0 } } } }, { { { { 46.0 } }, { { 47.0 } } }, { { { 48.0 } }, { { 49.0 } } } } } } } });
    std::vector<s5> v2({ { { { { { { { 50.0 } }, { { 51.0 } } }, { { { 52.0 } }, { { 53.0 } } } }, { { { 54.0 } }, { { 55.0 } } } }, { { { { { 56.0 } }, { { 57.0 } } }, { { { 58.0 } }, { { 59.0 } } } }, { { { 60.0 } }, { { 61.0 } } } } }, { { { { 62.0 } }, { { 63.0 } } } } }, { { { { { { { 64.0 } }, { { 65.0 } } }, { { { 66.0 } }, { { 67.0 } } } }, { { { 68.0 } }, { { 69.0 } } } }, { { { { { 70.0 } }, { { 71.0 } } }, { { { 72.0 } }, { { 73.0 } } } }, { { { 74.0 } }, { { 75.0 } } } } }, { { { { 76.0 } }, { { 77.0 } } } } }, { { { { { { { 78.0 } }, { { 79.0 } } }, { { { 80.0 } }, { { 81.0 } } } }, { { { 82.0 } }, { { 83.0 } } } }, { { { { { 84.0 } }, { { 85.0 } } }, { { { 86.0 } }, { { 87.0 } } } }, { { { 88.0 } }, { { 89.0 } } } } }, { { { { 90.0 } }, { { 91.0 } } } } } });
    std::vector<s0> v3({ { { { 92.0 } }, { { 93.0 } } }, { { { 94.0 } }, { { 95.0 } } } });
    double v4(96.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
