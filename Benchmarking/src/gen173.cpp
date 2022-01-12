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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s1> p0;
    s3 p1;
    s7(std::vector<s1> v0, s3 v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<s0>> f2(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v3 = v0;
    v3 = v0;
    std::vector<std::vector<s0>> v1 = v0;
    std::vector<std::vector<s0>> v2 = v1;
    std::vector<std::vector<s0>> v6 = v0;
    const std::vector<s0> v7 = v1[1];
    v3[2] = v7;
    std::vector<std::vector<s0>> v4 = v6;
    std::vector<s0> v8 = v7;
    const std::vector<s0> v9 = v1[1];
    v3[1] = v8;
    const s0 v5 = v8[0];
    s0 v12 = v5;
    const s0 v16 = v8[0];
    const std::vector<std::vector<double>> v20 = v12.p1;
    v1[1] = v8;
    const std::vector<std::vector<double>> v10 = v16.p0;
    std::vector<std::vector<double>> v11 = v20;
    const std::vector<std::vector<double>> v21 = v5.p0;
    const std::vector<std::vector<double>> v15 = v16.p0;
    const std::vector<std::vector<double>> v22 = v5.p0;
    std::vector<std::vector<double>> v14 = v21;
    const s0 v25 = v8[0];
    const std::vector<double> v34 = v14[1];
    const std::vector<std::vector<double>> v24 = v16.p1;
    const s0 v13(v21, v20);
    std::vector<s0> v43 = v7;
    v12.p1 = v20;
    const std::vector<double> v32 = v15[0];
    const std::vector<std::vector<double>> v30 = v25.p0;
    const std::vector<std::vector<double>> v17 = v25.p1;
    std::vector<double> v33 = v32;
    v3[1] = v9;
    v4[0] = v43;
    v3[2] = v43;
    std::vector<std::vector<double>> v29 = v20;
    const double v39 = v32[0];
    const std::vector<std::vector<double>> v35 = v13.p1;
    const double v19 = v34[0];
    v14[0] = v33;
    const std::vector<double> v26 = v17[1];
    const s0 v73 = v8[0];
    v12.p1 = v29;
    std::vector<s0> v58 = v9;
    v4[1] = v58;
    v11 = v20;
    const std::vector<s0> v59 = v2[2];
    v33[0] = v19;
    const std::vector<s0> v97 = v6[2];
    const s0 v31 = v97[0];
    const std::vector<std::vector<double>> v36 = v73.p0;
    const s0 v48(v36, v35);
    v58[0] = v48;
    const double v38 = v19 * v39;
    const std::vector<std::vector<double>> v93 = v25.p0;
    v12.p1 = v29;
    const std::vector<s0> v37 = v4[2];
    v11[1] = v26;
    s0 v23 = v31;
    const std::vector<std::vector<std::vector<double>>> v70 { v17, v35, v24 };
    const std::vector<std::vector<double>> v84 = v48.p1;
    v23.p1 = v17;
    std::vector<double> v52 = v26;
    v14[1] = v52;
    v12.p1 = v20;
    const s0 v104 = v59[0];
    const std::vector<std::vector<double>> v81 = v70[0];
    v12.p1 = v84;
    v12.p0 = v93;
    v12.p0 = v15;
    const std::vector<std::vector<double>> v45 = v23.p1;
    const std::vector<s0> v86 = v3[1];
    v23.p0 = v22;
    const s1 v124(v12, v6);
    double v51 = v19;
    v2[0] = v8;
    const s0 v56 = v124.p0;
    v23.p1 = v84;
    const std::vector<s0> v66 = v3[0];
    std::vector<s0> v90 = v9;
    v11[0] = v34;
    v33[0] = v38;
    const double v78 = v19 + v51;
    v12.p1 = v17;
    v4[0] = v9;
    const std::vector<std::vector<double>> v72 = v104.p1;
    v90[0] = v56;
    v8 = v7;
    v2[1] = v37;
    v12.p0 = v36;
    std::vector<std::vector<s0>> v169 = v3;
    v169[0] = v90;
    v43[0] = v31;
    v90[0] = v25;
    v169[2] = v66;
    v23.p1 = v81;
    const double v155 = v78 * v51;
    v23.p0 = v30;
    v23.p1 = v72;
    v12.p1 = v45;
    v52[0] = v155;
    v3[1] = v86;
    const std::vector<s0> v100 = v2[0];
    v12.p0 = v10;
    v12.p1 = v11;
    v2[0] = v58;
    v2[1] = v100;
    v8[0] = v12;
    return v169;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s3 v5 = v0.p1;
    const s2 v4 = v5.p0;
    const std::vector<std::vector<s0>> v11 = v4.p1;
    const std::vector<std::vector<s0>> v16 = f2(v11);
    const std::vector<s0> v12 = v16[0];
    const s0 v18 = v12[0];
    s0 v13 = v18;
    const std::vector<std::vector<double>> v26 = v13.p0;
    const std::vector<double> v37 = v26[0];
    v13.p0 = v26;
    const std::vector<std::vector<double>> v63 = v13.p0;
    v13.p0 = v63;
    v13.p0 = v26;
    v13.p0 = v26;
    const double v159 = v37[0];
    return v159;
  }
  int main() {
    s7 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } }, { { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } }, { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } }, { { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } }, { { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } } } } }, { { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } }, { { { { { 90.0 }, { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } } }, { { { { 95.0 }, { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } }, { { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 }, { 104.0 } } } } } } } });
    double v1(105.0);
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
