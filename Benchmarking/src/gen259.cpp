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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f12(const double &v0, const s1 &v1) {
    const s0 v7 = v1.p1;
    s0 v3 = v7;
    const s0 v2 = v1.p1;
    s0 v5 = v7;
    const s0 v9 = v1.p1;
    const std::vector<std::vector<double>> v4 = v3.p0;
    s0 v10 = v5;
    const std::vector<std::vector<double>> v11 = v2.p1;
    const std::vector<s0> v23 = v1.p0;
    const std::vector<std::vector<double>> v46 = v5.p1;
    const s0 v16(v4, v11);
    const std::vector<s0> v13 { v7, v10, v10 };
    v5.p0 = v46;
    std::vector<s0> v12 = v13;
    const std::vector<std::vector<double>> v19 = v5.p0;
    v12 = v13;
    v3.p0 = v4;
    v5.p1 = v46;
    s1 v36 = v1;
    const std::vector<std::vector<double>> v17 = v9.p0;
    const s0 v18 = v36.p1;
    const s0 v26 = v36.p1;
    const s0 v42 = v23[0];
    const s0 v52 = v23[0];
    v5.p1 = v46;
    const s0 v59 = v23[0];
    const std::vector<s0> v48 = v36.p0;
    std::vector<s0> v43 = v12;
    const s0 v27 = v12[1];
    std::vector<s0> v22 = v43;
    const std::vector<s0> v57 { v2, v9 };
    v36.p1 = v9;
    v12[1] = v27;
    std::vector<s0> v56 = v43;
    v56[2] = v7;
    v56[1] = v42;
    v22[1] = v16;
    s1 v69 = v36;
    const s0 v30 = v23[0];
    const std::vector<s0> v29 = v69.p0;
    const std::vector<s0> v39 = v1.p0;
    v22[2] = v42;
    std::vector<s0> v38 = v57;
    const s0 v98 = v56[2];
    v43 = v22;
    s1 v77 = v36;
    const s0 v49 = v39[0];
    const std::vector<s0> v47 = v77.p0;
    v69.p0 = v39;
    v22[0] = v18;
    const s0 v64 = v38[0];
    const std::vector<std::vector<double>> v85 = v49.p1;
    v5.p0 = v17;
    const std::vector<std::vector<double>> v113 = v64.p1;
    s0 v72 = v9;
    const std::vector<std::vector<double>> v60 = v3.p0;
    const s2 v53(v2, v18);
    v77.p0 = v47;
    v22[1] = v18;
    const s0 v99 = v53.p1;
    v5.p1 = v60;
    v12[0] = v52;
    v36.p1 = v49;
    const std::vector<std::vector<s0>> v76 { v47, v48, v39, v29 };
    v12[0] = v59;
    v3.p0 = v19;
    const std::vector<std::vector<double>> v123 = v30.p0;
    v77.p1 = v72;
    v12[2] = v26;
    const s0 v295 = v23[0];
    v72.p0 = v113;
    const std::vector<s0> v182 = v76[2];
    v69.p1 = v98;
    v22 = v13;
    v10.p0 = v123;
    const s1 v283(v182, v98);
    std::vector<s0> v148 = v29;
    v3.p0 = v85;
    v36.p1 = v99;
    v38[0] = v295;
    v36.p0 = v148;
    return v283;
  }
  s0 f7(const s1 &v0, const s0 &v1, const s1 &v2) {
    const std::vector<std::vector<double>> v8 = v1.p1;
    const std::vector<double> v4 = v8[1];
    const double v7 = v4[0];
    const std::vector<std::vector<double>> v9 = v1.p0;
    s1 v14 = v2;
    const std::vector<double> v23 = v9[1];
    const std::vector<s0> v18 = v14.p0;
    v14.p1 = v1;
    v14.p1 = v1;
    const double v20 = v7 - v7;
    v14.p0 = v18;
    const double v33 = v4[0];
    const double v17 = v23[0];
    const s1 v22 = f12(v20, v14);
    v14.p1 = v1;
    const s1 v30 = f12(v17, v0);
    const s1 v25 = f12(v33, v30);
    const s1 v26 = f12(v33, v25);
    const std::vector<s0> v34 = v26.p0;
    const std::vector<s0> v104 = v26.p0;
    s1 v59 = v22;
    const std::vector<s0> v35 = v59.p0;
    const s0 v84 = v18[0];
    s0 v129 = v84;
    const s0 v79 = v35[0];
    std::vector<s0> v95 = v34;
    v59.p0 = v104;
    v14.p0 = v35;
    v14.p1 = v84;
    v14.p0 = v95;
    v95[0] = v129;
    return v79;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s2 &v1, const s0 &v2, const std::vector<s1> &v3, const double &v4) {
    const s1 v10(v0, v2);
    std::vector<s0> v9 = v0;
    const std::vector<s0> v5 = v10.p0;
    const s0 v7 = v1.p0;
    double v6 = v4;
    s0 v8 = v2;
    s1 v13 = v10;
    const std::vector<s0> v11 = v10.p0;
    const s0 v15 = v10.p1;
    v13.p0 = v11;
    s1 v12 = v10;
    v13.p1 = v2;
    const s1 v14(v9, v2);
    const s0 v17 = v9[0];
    const s1 v35 = f12(v4, v12);
    v9[0] = v15;
    const std::vector<std::vector<double>> v19 = v8.p1;
    const std::vector<s0> v28 = v13.p0;
    const s0 v46 = f7(v12, v17, v14);
    const std::vector<double> v23 = v19[1];
    const s0 v30 = f7(v35, v7, v13);
    v8.p1 = v19;
    v12.p0 = v5;
    v8.p1 = v19;
    const double v44 = v23[0];
    const std::vector<std::vector<double>> v54 = v46.p1;
    v13.p0 = v28;
    std::vector<double> v109 = v23;
    const std::vector<double> v110 = v54[0];
    std::vector<double> v97 = v109;
    v13 = v12;
    v109[0] = v44;
    const double v127 = v97[0];
    const double v120 = v44 - v6;
    v9[0] = v30;
    v109 = v110;
    v97[0] = v6;
    const double v294 = v127 * v120;
    return v294;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } });
    s2 v1({ { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    s0 v2({ { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } });
    std::vector<s1> v3({ { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } });
    double v4(40.0);
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
