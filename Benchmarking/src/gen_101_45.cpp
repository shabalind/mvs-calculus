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
    s0 p0;
    std::vector<s1> p1;
    s2(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s0 f51(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    s0 v2 = v0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const s0 v3(v5, v4);
    v2.p1 = v4;
    const std::vector<s0> v9 { v3, v2 };
    const std::vector<std::vector<double>> v1 = v3.p0;
    const std::vector<std::vector<double>> v15 = v0.p1;
    const s0 v17 = v9[1];
    v2.p1 = v4;
    v2.p0 = v15;
    const std::vector<std::vector<double>> v12 = v2.p0;
    const s0 v10(v12, v1);
    s0 v34 = v0;
    v2.p1 = v4;
    std::vector<s0> v28 = v9;
    const std::vector<std::vector<double>> v25 = v3.p1;
    v28[1] = v2;
    const std::vector<std::vector<double>> v18 = v34.p0;
    v2.p1 = v18;
    v28[0] = v3;
    const std::vector<std::vector<double>> v23 = v2.p1;
    v28[1] = v10;
    const std::vector<std::vector<double>> v47 = v34.p1;
    v28[1] = v17;
    s0 v19 = v0;
    const s0 v26 = v9[0];
    const std::vector<std::vector<double>> v43 = v3.p1;
    v2.p1 = v25;
    std::vector<s0> v56 = v9;
    v19.p1 = v25;
    v56[0] = v26;
    v2.p0 = v43;
    const std::vector<std::vector<s0>> v76 { v28, v56 };
    v19.p1 = v23;
    const std::vector<s0> v107 = v76[0];
    v19.p0 = v47;
    const std::vector<std::vector<double>> v100 = v19.p1;
    const std::vector<std::vector<double>> v110 = v19.p0;
    v34.p0 = v100;
    v56[1] = v26;
    v2.p1 = v110;
    const s0 v152 = v107[1];
    return v152;
  }
  s0 f46(const s0 &v0) {
    s0 v1 = v0;
    const s0 v5 = f51(v1);
    const s0 v7 = f51(v1);
    const s0 v3 = f51(v5);
    const std::vector<std::vector<double>> v8 = v1.p1;
    const std::vector<std::vector<double>> v4 = v3.p1;
    const std::vector<std::vector<double>> v14 = v7.p0;
    const std::vector<double> v6 = v14[0];
    s0 v13 = v0;
    const std::vector<double> v11 = v8[0];
    const s0 v15 = f51(v0);
    const std::vector<std::vector<double>> v23 = v15.p0;
    const std::vector<double> v12 = v8[1];
    v1.p0 = v14;
    const s0 v10 = f51(v13);
    const s0 v21 = f51(v10);
    std::vector<std::vector<double>> v32 = v23;
    const std::vector<std::vector<double>> v22 = v10.p1;
    v32[0] = v12;
    std::vector<std::vector<double>> v20 = v14;
    const std::vector<std::vector<std::vector<double>>> v26 { v4, v4, v20 };
    const s0 v59 = f51(v3);
    s0 v30 = v15;
    std::vector<std::vector<std::vector<double>>> v46 = v26;
    std::vector<std::vector<std::vector<double>>> v34 = v46;
    std::vector<std::vector<std::vector<double>>> v33 = v26;
    const s0 v63 = f51(v0);
    const s0 v58 = f51(v59);
    const std::vector<std::vector<double>> v73 = v34[1];
    std::vector<std::vector<std::vector<double>>> v70 = v46;
    v34 = v70;
    v32[1] = v11;
    v13.p0 = v73;
    const std::vector<std::vector<double>> v66 = v58.p0;
    v34[0] = v22;
    const std::vector<std::vector<double>> v39 = v33[1];
    const std::vector<std::vector<double>> v112 = v33[0];
    const s0 v81 = f51(v21);
    v1.p0 = v112;
    const std::vector<std::vector<double>> v124 = v7.p0;
    const s0 v128 = f51(v10);
    const std::vector<std::vector<double>> v110 = v63.p1;
    v1.p0 = v20;
    v1.p0 = v124;
    const std::vector<std::vector<double>> v163 = v81.p0;
    v30.p1 = v32;
    v13.p1 = v163;
    v32[1] = v6;
    const s0 v174 = f51(v128);
    v30.p1 = v4;
    const std::vector<std::vector<double>> v88 = v174.p1;
    v20 = v39;
    v30.p1 = v66;
    v1.p0 = v110;
    v30.p0 = v88;
    v1.p0 = v112;
    return v30;
  }
  s0 f44(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v6 = v0.p1;
    std::vector<std::vector<double>> v10 = v6;
    const std::vector<std::vector<double>> v5 = v4.p0;
    const s0 v13(v5, v10);
    return v13;
  }
  s0 f21(const s0 &v0) {
    const s0 v3 = f44(v0);
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<double> v4 = v1[1];
    std::vector<std::vector<double>> v8 = v1;
    const std::vector<double> v2 = v1[0];
    s0 v6 = v3;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v36 = v0.p0;
    s0 v15 = v3;
    const s0 v13 = f44(v15);
    v8[1] = v4;
    v8[1] = v2;
    const std::vector<std::vector<double>> v25 = v6.p0;
    v6.p0 = v5;
    v6.p0 = v5;
    s0 v27 = v3;
    const std::vector<std::vector<double>> v30 = v27.p0;
    const std::vector<std::vector<double>> v40 = v13.p0;
    const std::vector<std::vector<double>> v66 = v27.p0;
    const s0 v60 = f46(v6);
    v27.p0 = v36;
    v6.p1 = v66;
    v15.p0 = v1;
    const std::vector<std::vector<double>> v70 = v60.p0;
    v6.p0 = v36;
    v6.p0 = v8;
    v27.p1 = v1;
    v15.p0 = v5;
    v27.p1 = v25;
    s0 v191 = v15;
    v27.p0 = v1;
    v27.p0 = v40;
    v191.p0 = v30;
    const std::vector<std::vector<double>> v394 = v191.p0;
    v15.p0 = v70;
    v15.p0 = v394;
    return v191;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<s2>> &v1, const double &v2) {
    const std::vector<s2> v3 = v1[1];
    const s2 v5 = v3[0];
    const std::vector<std::vector<double>> v10 = v0.p1;
    std::vector<std::vector<double>> v4 = v10;
    const s0 v25 = v5.p0;
    const s0 v16 = f51(v25);
    std::vector<std::vector<double>> v12 = v10;
    const std::vector<std::vector<double>> v9 = v16.p1;
    const s0 v17 = f21(v0);
    const std::vector<std::vector<double>> v29 = v17.p1;
    const std::vector<double> v24 = v12[1];
    std::vector<std::vector<double>> v37 = v4;
    const std::vector<double> v39 = v29[0];
    const std::vector<double> v55 = v9[0];
    v37[1] = v39;
    v37[0] = v24;
    v37[1] = v39;
    v12[0] = v55;
    v12[0] = v24;
    const std::vector<double> v91 = v37[1];
    std::vector<double> v152 = v91;
    const double v229 = v152[0];
    return v229;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } });
    std::vector<std::vector<s2>> v1({ { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } } } } }, { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } }, { { { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } }, { { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } } } }, { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } }, { { { { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } }, { { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } } }, { { { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } }, { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } } } } } } } } });
    double v2(88.0);
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
