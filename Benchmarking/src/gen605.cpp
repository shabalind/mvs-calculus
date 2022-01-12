  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s2(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    std::vector<s3> p1;
    s7(s1 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  s0 f70(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    std::vector<std::vector<double>> v2 = v1;
    const std::vector<double> v4 = v1[0];
    const double v5 = v4[0];
    const std::vector<double> v6 = v2[1];
    const std::vector<double> v7 = v1[0];
    v2[1] = v7;
    double v15 = v5;
    double v27 = v5;
    std::vector<double> v17 = v6;
    const double v9 = v27 + v27;
    const double v10 = v9 / v15;
    v2[0] = v7;
    const std::vector<double> v14 = v0.p1;
    v2[1] = v14;
    const std::vector<std::vector<double>> v40 = v0.p0;
    const s0 v24(v40, v17);
    const double v26 = v15 + v27;
    double v23 = v26;
    const double v66 = v4[0];
    v17[0] = v26;
    const s0 v32(v2, v4);
    v17[0] = v66;
    const std::vector<std::vector<double>> v57 = v32.p0;
    s0 v63 = v24;
    v63.p0 = v2;
    v17[0] = v23;
    v15 = v10;
    v63.p0 = v57;
    return v63;
  }
  s0 f68(const s0 &v0) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v3 = v2.p0;
    const std::vector<double> v4 = v3[1];
    const s0 v5 = f70(v0);
    const std::vector<double> v7 = v3[0];
    const std::vector<double> v1 = v5.p1;
    const std::vector<std::vector<double>> v9 = v5.p0;
    std::vector<std::vector<double>> v8 = v3;
    v2.p0 = v9;
    const std::vector<double> v6 = v3[1];
    const s0 v10 = f70(v0);
    const std::vector<double> v17 = v10.p1;
    v2.p1 = v1;
    const double v11 = v1[0];
    const std::vector<std::vector<double>> v15 = v0.p0;
    std::vector<std::vector<double>> v13 = v3;
    const std::vector<double> v18 = v5.p1;
    v2.p0 = v3;
    const s0 v14 = f70(v0);
    v2.p1 = v17;
    v13[1] = v6;
    const s0 v22(v8, v4);
    v2.p1 = v17;
    const s0 v31 = f70(v2);
    const s0 v23 = f70(v0);
    const s0 v43 = f70(v31);
    std::vector<double> v24 = v1;
    const double v21 = v18[0];
    v8[1] = v7;
    const std::vector<std::vector<double>> v25 = v22.p0;
    s0 v27 = v23;
    const s0 v39 = f70(v2);
    const std::vector<double> v28 = v0.p1;
    const double v29 = v24[0];
    const std::vector<std::vector<double>> v35 = v39.p0;
    v2.p1 = v4;
    v27.p0 = v8;
    const s0 v46 = f70(v43);
    v13[0] = v28;
    const std::vector<double> v59 = v35[0];
    v2.p0 = v13;
    std::vector<std::vector<double>> v48 = v13;
    const std::vector<double> v52 = v48[0];
    const std::vector<std::vector<double>> v51 = v2.p0;
    const s0 v122 = f70(v23);
    v27.p1 = v28;
    std::vector<std::vector<double>> v33 = v9;
    v27.p0 = v25;
    const std::vector<double> v60 = v122.p1;
    const std::vector<std::vector<double>> v65 = v10.p0;
    const std::vector<double> v92 = v2.p1;
    std::vector<double> v40 = v7;
    const std::vector<double> v133 = v46.p1;
    const s0 v78 = f70(v27);
    v13[0] = v133;
    v33[0] = v40;
    const s0 v93 = f70(v2);
    std::vector<std::vector<double>> v90 = v8;
    const s0 v66 = f70(v0);
    v27.p1 = v28;
    const std::vector<double> v49 = v51[1];
    std::vector<double> v71 = v18;
    const std::vector<std::vector<double>> v44 { v52, v59, v71, v24 };
    const std::vector<double> v72 = v93.p1;
    const std::vector<double> v85 = v44[0];
    v90[1] = v85;
    v2.p1 = v40;
    v27.p0 = v15;
    v48[0] = v40;
    std::vector<double> v57 = v72;
    const std::vector<double> v83 = v65[1];
    v48[0] = v57;
    const double v150 = v92[0];
    const s0 v63 = f70(v14);
    v2.p0 = v3;
    v71[0] = v150;
    double v117 = v11;
    const double v107 = v83[0];
    v24[0] = v29;
    v27.p1 = v7;
    v27.p0 = v90;
    v90 = v8;
    v27.p1 = v60;
    v27.p0 = v15;
    std::vector<std::vector<double>> v219 = v35;
    v27.p0 = v8;
    std::vector<std::vector<double>> v165 = v33;
    const std::vector<std::vector<double>> v469 = v66.p0;
    const std::vector<double> v115 = v63.p1;
    v57 = v49;
    v27.p1 = v17;
    v40[0] = v21;
    v71[0] = v117;
    v27.p0 = v219;
    const s0 v211 = f70(v78);
    v40[0] = v107;
    v27.p0 = v469;
    v27.p1 = v115;
    v2.p0 = v165;
    v2.p0 = v33;
    return v211;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const s7 &v1, const double &v2) {
    const s1 v9 = v1.p0;
    const std::vector<s1> v5 { v9 };
    const s1 v12 = v5[0];
    const std::vector<s0> v14 = v12.p0;
    const s0 v35 = v14[0];
    const s0 v52 = f68(v35);
    const std::vector<std::vector<double>> v38 = v52.p0;
    const std::vector<double> v97 = v38[1];
    std::vector<std::vector<double>> v155 = v38;
    const std::vector<double> v27 = v155[0];
    v155[1] = v97;
    const double v71 = v27[0];
    return v71;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 } }, { 2.0 } }, { { { { { 3.0 }, { 4.0 } }, { 5.0 } } } } }, { { { { 6.0 }, { 7.0 } }, { 8.0 } }, { { { { { 9.0 }, { 10.0 } }, { 11.0 } } } } } });
    s7 v1({ { { { { { 12.0 }, { 13.0 } }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { 17.0 } } }, { { { { { { 18.0 }, { 19.0 } }, { 20.0 } }, { { { { { 21.0 }, { 22.0 } }, { 23.0 } } } } }, { { { { 24.0 }, { 25.0 } }, { 26.0 } }, { { { { { 27.0 }, { 28.0 } }, { 29.0 } } } } } }, { { { { { 30.0 }, { 31.0 } }, { 32.0 } }, { { { { { 33.0 }, { 34.0 } }, { 35.0 } } } } }, { { { { 36.0 }, { 37.0 } }, { 38.0 } }, { { { { { 39.0 }, { 40.0 } }, { 41.0 } } } } } } } });
    double v2(42.0);
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
