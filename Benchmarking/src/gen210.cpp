  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f35(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    s0 v6 = v0;
    v6.p1 = v4;
    s0 v1 = v0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v9 = v6.p1;
    const std::vector<double> v5 = v4[2];
    v6.p1 = v9;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<double> v16 = v9[1];
    std::vector<double> v12 = v16;
    const std::vector<std::vector<double>> v14 = v0.p1;
    const std::vector<std::vector<double>> v34 = v1.p0;
    std::vector<std::vector<double>> v15 = v8;
    std::vector<std::vector<double>> v24 = v2;
    std::vector<std::vector<double>> v18 = v8;
    const std::vector<std::vector<double>> v19 = v0.p0;
    const std::vector<double> v40 = v19[1];
    v6.p0 = v8;
    std::vector<std::vector<double>> v22 = v14;
    v18[0] = v12;
    const std::vector<double> v27 = v15[0];
    const double v36 = v40[0];
    v1.p1 = v9;
    v1.p1 = v9;
    s0 v37 = v6;
    const double v30 = v27[0];
    std::vector<std::vector<double>> v54 = v18;
    const std::vector<std::vector<double>> v38 = v37.p0;
    v12[0] = v36;
    v22[0] = v5;
    v6.p0 = v15;
    const std::vector<std::vector<double>> v119 = v6.p1;
    v1.p1 = v119;
    v1.p1 = v9;
    v54[1] = v40;
    std::vector<std::vector<double>> v108 = v14;
    const std::vector<double> v46 = v34[1];
    v1.p0 = v19;
    const std::vector<double> v65 = v22[0];
    const std::vector<std::vector<double>> v56 = v37.p0;
    const std::vector<std::vector<double>> v49 = v37.p1;
    const std::vector<double> v73 = v34[1];
    v15 = v8;
    const std::vector<double> v155 = v108[1];
    v24[0] = v73;
    const std::vector<std::vector<double>> v78 = v6.p0;
    v1.p0 = v15;
    v37.p1 = v24;
    v6.p0 = v34;
    const s0 v106(v38, v49);
    const std::vector<double> v68 = v54[0];
    v12[0] = v30;
    v6.p0 = v19;
    v24[0] = v68;
    v108[0] = v65;
    v1.p0 = v38;
    v37.p1 = v22;
    v54[1] = v46;
    v37.p0 = v78;
    v6.p0 = v56;
    v18[0] = v155;
    return v106;
  }
  s0 f32(const s0 &v0, const s0 &v1, const s0 &v2, const s0 &v3) {
    s0 v6 = v2;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v5 = v3.p0;
    const std::vector<double> v8 = v5[0];
    v6.p0 = v5;
    std::vector<std::vector<double>> v14 = v5;
    v6.p0 = v4;
    v6.p0 = v14;
    v6.p0 = v14;
    v14[1] = v8;
    return v6;
  }
  s0 f26(const s0 &v0) {
    const s0 v2 = f35(v0);
    const s0 v1 = f35(v0);
    const s0 v14 = f32(v0, v2, v2, v2);
    const s0 v35 = f32(v2, v2, v0, v0);
    const s0 v21 = f32(v1, v35, v14, v2);
    const s0 v17 = f32(v1, v21, v0, v14);
    const s0 v18 = f32(v2, v1, v1, v17);
    const s0 v15 = f32(v1, v14, v18, v35);
    const std::vector<std::vector<double>> v28 = v35.p0;
    const s0 v42 = f35(v17);
    const s0 v53 = f35(v14);
    const s0 v29 = f32(v0, v15, v21, v0);
    const s0 v36 = f32(v53, v42, v29, v29);
    const std::vector<std::vector<double>> v43 = v35.p0;
    s0 v70 = v36;
    v70.p0 = v28;
    const s0 v46 = f35(v70);
    const std::vector<std::vector<double>> v73 = v46.p1;
    const s0 v133(v43, v73);
    return v133;
  }
  s0 f25(const s0 &v0) {
    const s0 v3 = f26(v0);
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    std::vector<std::vector<double>> v1 = v5;
    const s0 v4 = f32(v3, v3, v3, v0);
    const s0 v2 = f35(v4);
    const std::vector<double> v8 = v7[0];
    const double v11 = v8[0];
    std::vector<double> v10 = v8;
    std::vector<std::vector<double>> v12 = v1;
    std::vector<std::vector<double>> v16 = v12;
    v12[2] = v10;
    const s0 v29 = f26(v2);
    v12[0] = v8;
    const s0 v24 = f32(v4, v3, v4, v2);
    const std::vector<double> v19 = v7[0];
    const std::vector<double> v22 = v5[1];
    const double v38 = v22[0];
    const s0 v41 = f26(v29);
    const s0 v42 = f35(v29);
    v12[1] = v19;
    const double v59 = v38 * v11;
    const std::vector<std::vector<double>> v44 = v4.p0;
    v12 = v1;
    const std::vector<std::vector<double>> v115 = v24.p1;
    s0 v80 = v0;
    std::vector<std::vector<double>> v112 = v44;
    const s0 v82 = f35(v80);
    v80.p0 = v44;
    v80.p1 = v115;
    const s0 v125 = f32(v42, v82, v80, v80);
    const std::vector<std::vector<double>> v120 = v125.p1;
    const std::vector<std::vector<double>> v67 = v125.p0;
    const std::vector<std::vector<double>> v101 = v0.p1;
    v80.p0 = v67;
    s0 v93 = v2;
    v80.p1 = v16;
    const std::vector<std::vector<double>> v87 = v93.p0;
    v80.p1 = v101;
    const s0 v131(v87, v120);
    const std::vector<std::vector<double>> v78 = v41.p1;
    const std::vector<double> v148 = v78[1];
    const s0 v150 = f32(v42, v131, v2, v2);
    v10[0] = v59;
    const s0 v178 = f26(v150);
    v93.p0 = v112;
    v16[0] = v148;
    return v178;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v7 = v0[0];
    const s0 v3 = f25(v7);
    const std::vector<std::vector<double>> v6 = v3.p0;
    double v2 = v1;
    const std::vector<double> v40 = v6[1];
    const double v130 = v40[0];
    const double v76 = v130 - v2;
    double v195 = v76;
    return v195;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } });
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
