  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  s0 f50(const s0 &v0) {
    return v0;
  }
  s0 f45(const s0 &v0, const s0 &v1) {
    const s0 v7 = f50(v1);
    s0 v8 = v0;
    const std::vector<std::vector<double>> v3 = v7.p0;
    const std::vector<std::vector<double>> v6 = v1.p0;
    v8.p0 = v6;
    v8.p0 = v6;
    v8 = v0;
    const std::vector<double> v5 = v6[1];
    const std::vector<std::vector<double>> v2 = v8.p0;
    std::vector<std::vector<double>> v10 = v2;
    v8.p0 = v3;
    v8.p0 = v10;
    v8.p0 = v6;
    const s0 v20 = f50(v0);
    const double v35 = v5[0];
    const s0 v23 = f50(v20);
    v8.p0 = v3;
    s0 v25 = v23;
    v25.p1 = v35;
    v25.p0 = v2;
    const s0 v38 = f50(v25);
    return v38;
  }
  s0 f44(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v3 = v4.p0;
    const double v2 = v0.p1;
    const s0 v8 = f45(v0, v0);
    const s0 v5 = f50(v4);
    const std::vector<s0> v1 { v0 };
    s0 v14 = v8;
    v4.p1 = v2;
    const std::vector<std::vector<double>> v13 = v5.p0;
    const double v16 = v4.p1;
    const s0 v15 = v1[0];
    const std::vector<double> v28 = v13[1];
    std::vector<double> v20 = v28;
    v4 = v15;
    const double v40 = v14.p1;
    std::vector<std::vector<double>> v65 = v3;
    v65[1] = v20;
    double v71 = v40;
    const s0 v70(v65, v40);
    v4.p1 = v71;
    v14.p1 = v40;
    v65[1] = v28;
    v4.p1 = v16;
    v65[1] = v20;
    const s0 v93 = f45(v70, v5);
    return v93;
  }
  s0 f42(const s0 &v0) {
    const double v5 = v0.p1;
    const double v2 = v5 + v5;
    const double v4 = v0.p1;
    double v1 = v4;
    double v8 = v5;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const s0 v7 = f44(v0);
    const s0 v10 = f50(v7);
    s0 v17 = v0;
    v17.p1 = v2;
    const s0 v20 = f45(v10, v17);
    const s0 v32 = f45(v17, v20);
    v1 = v8;
    const s0 v26 = f45(v32, v10);
    v17.p0 = v9;
    const s0 v87 = f45(v20, v26);
    v17.p1 = v1;
    return v87;
  }
  s0 f41(const s0 &v0) {
    s0 v3 = v0;
    const s0 v9 = f45(v0, v0);
    s0 v6 = v3;
    s0 v5 = v6;
    s0 v8 = v9;
    s0 v7 = v8;
    s0 v4 = v0;
    const s0 v2 = f42(v6);
    s0 v10 = v7;
    const std::vector<std::vector<double>> v11 = v3.p0;
    const std::vector<double> v25 = v11[2];
    const std::vector<double> v1 = v11[1];
    const std::vector<std::vector<double>> v13 = v0.p0;
    std::vector<std::vector<double>> v12 = v13;
    s0 v16 = v3;
    v4.p0 = v11;
    const s0 v18 = f42(v4);
    const std::vector<double> v22 = v12[1];
    std::vector<double> v35 = v25;
    const double v23 = v25[0];
    s0 v14 = v16;
    const double v24 = v18.p1;
    const double v26 = v9.p1;
    double v15 = v23;
    v3 = v2;
    std::vector<double> v43 = v35;
    v12[2] = v43;
    v43[0] = v24;
    v14.p0 = v11;
    const s0 v32 = f45(v0, v2);
    const s0 v34 = f50(v10);
    std::vector<double> v58 = v22;
    const s0 v72 = f44(v8);
    const double v28 = v1[0];
    const s0 v47 = f42(v72);
    double v46 = v28;
    const double v68 = v34.p1;
    v43 = v35;
    const double v39 = v5.p1;
    v4.p1 = v46;
    v43[0] = v26;
    const double v49 = v43[0];
    v35[0] = v49;
    v58[0] = v15;
    v58[0] = v46;
    const s0 v57 = f45(v5, v4);
    v16 = v32;
    v12[2] = v58;
    v4.p1 = v68;
    const std::vector<double> v228 = v11[0];
    std::vector<double> v104 = v25;
    std::vector<std::vector<double>> v82 = v13;
    v12[2] = v22;
    const s0 v38 = f45(v14, v57);
    v82[1] = v104;
    v58 = v228;
    const std::vector<std::vector<double>> v157 = v47.p0;
    v3.p1 = v23;
    v7.p0 = v157;
    v35[0] = v68;
    v43[0] = v39;
    v16.p0 = v82;
    v5.p0 = v157;
    std::vector<double> v169 = v58;
    const double v149 = v0.p1;
    v4.p1 = v149;
    v82[1] = v169;
    v58[0] = v46;
    v82[2] = v43;
    return v38;
  }
  s0 f40(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    s0 v7 = v0;
    const std::vector<double> v4 = v5[2];
    const double v9 = v4[0];
    const s0 v6 = f45(v7, v0);
    v7.p0 = v5;
    const s0 v8 = f41(v6);
    const std::vector<std::vector<double>> v19 = v8.p0;
    const double v18 = v4[0];
    v7.p1 = v18;
    const std::vector<std::vector<double>> v13 = v6.p0;
    v7.p1 = v9;
    const s0 v37 = f45(v8, v8);
    v7.p0 = v19;
    v7.p0 = v13;
    const s0 v29 = f42(v6);
    s0 v48 = v29;
    const s0 v53 = f45(v37, v48);
    return v53;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v6 = f40(v0);
    const std::vector<std::vector<double>> v19 = v6.p0;
    const std::vector<double> v17 = v19[0];
    const double v21 = v17[0];
    return v21;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, 3.0 });
    std::vector<s0> v1({ { { { 4.0 }, { 5.0 }, { 6.0 } }, 7.0 } });
    double v2(8.0);
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
