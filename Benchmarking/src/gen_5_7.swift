  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s1]
  }
  struct s3 {
    var p0: s0
    var p1: s2
  }
  struct s4 {
    var p0: s3
    var p1: s0
  }
  struct s6 {
    var p0: Double
    var p1: [s2]
  }
  struct s7 {
    var p0: [[s0]]
    var p1: [[s6]]
  }
  struct s10 {
    var p0: s4
    var p1: [s3]
  }
  func f121(_ v0: s10, _ v1: s1) -> s10 {
    return v0
  }
  func f117(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p0
    let v4: [Double] = v3[1]
    var v7: s0 = v0
    let v11: Double = v4[0]
    v7.p0 = v3
    var v1: Double = v11
    v7.p0 = v3
    let v9: [[Double]] = v7.p0
    var v2: Double = v1
    let v5: [[Double]] = v0.p0
    let v14: [[Double]] = v7.p0
    var v40: [Double] = v4
    let v16: s0 = s0(p0: v3)
    v40[0] = v2
    var v18: [Double] = v4
    v7.p0 = v14
    let v15: [[Double]] = v7.p0
    v40[0] = v1
    let v21: Double = v2 + v11
    let v12: [Double] = [v11, v1, v21]
    let v26: [[Double]] = v16.p0
    v40[0] = v2
    v7.p0 = v5
    v40[0] = v11
    v7.p0 = v3
    var v25: s0 = v0
    v25.p0 = v9
    let v37: Double = v12[1]
    v7.p0 = v5
    let v35: [s0] = [v0, v25, v16, v7, v0, v7]
    v1 = v11
    let v43: [[Double]] = v25.p0
    var v31: [[Double]] = v14
    let v19: [[Double]] = v0.p0
    v7.p0 = v15
    let v52: [[Double]] = v0.p0
    let v32: [[Double]] = v7.p0
    v25.p0 = v52
    var v34: [s0] = v35
    v40[0] = v37
    var v41: [s0] = v34
    var v85: [s0] = v41
    v25.p0 = v26
    v31[0] = v40
    v7.p0 = v19
    v7.p0 = v5
    var v42: [[Double]] = v9
    v7.p0 = v32
    v7.p0 = v43
    v7.p0 = v31
    let v147: s0 = v85[1]
    v25.p0 = v42
    let v73: [[Double]] = v147.p0
    v25.p0 = v15
    v85 = v35
    let v145: Double = v18[0]
    v85[3] = v147
    v40[0] = v145
    let v126: s0 = s0(p0: v73)
    return v126
  }
  func f110(_ v0: s10) -> s10 {
    let v8: [s3] = v0.p1
    let v7: s4 = v0.p0
    let v3: s3 = v8[0]
    let v6: s0 = v7.p1
    var v13: s3 = v3
    var v39: s3 = v3
    let v15: s2 = v13.p1
    v39.p0 = v6
    v13 = v39
    let v21: s1 = v15.p0
    v39.p0 = v6
    v13.p1 = v15
    let v25: s0 = v21.p0
    var v38: s1 = v21
    v38.p0 = v25
    v38 = v21
    let v70: s10 = f121(v0, v38)
    let v48: [s1] = [v38, v38, v21, v21, v21, v21, v38]
    let v72: s1 = v48[3]
    let v152: s10 = f121(v70, v72)
    return v152
  }
  func f93(_ v0: s7) -> s7 {
    var v3: s7 = v0
    var v4: s7 = v0
    var v5: s7 = v4
    var v8: s7 = v5
    let v1: [[s6]] = v8.p1
    let v7: [[s0]] = v4.p0
    v5.p0 = v7
    let v15: [[s6]] = v3.p1
    v5.p1 = v1
    v8.p0 = v7
    v3.p0 = v7
    let v27: [[s6]] = v3.p1
    let v40: [[s0]] = v4.p0
    v3 = v0
    let v49: s7 = s7(p0: v7, p1: v27)
    v4.p1 = v27
    let v32: [[s0]] = v49.p0
    let v57: [[s0]] = v0.p0
    let v107: [s0] = v32[0]
    var v45: s7 = v4
    v4.p1 = v1
    v8 = v0
    var v173: [[s0]] = v57
    v8.p0 = v57
    v45.p0 = v40
    v45.p1 = v27
    v8.p0 = v173
    v8.p1 = v15
    v3.p0 = v7
    v173[0] = v107
    return v45
  }
  func f90(_ v0: s0) -> s0 {
    let v2: s0 = f117(v0)
    return v2
  }
  func f89(_ v0: s0) -> s0 {
    let v6: [[Double]] = v0.p0
    let v8: s0 = f117(v0)
    var v4: [[Double]] = v6
    let v11: [[Double]] = v0.p0
    var v7: [[Double]] = v11
    var v3: s0 = v8
    v3.p0 = v7
    v3 = v0
    var v36: s0 = v3
    v3.p0 = v4
    let v57: s0 = f117(v36)
    let v95: s0 = f90(v57)
    v36.p0 = v11
    return v95
  }
  func f87(_ v0: s3) -> s3 {
    var v5: s3 = v0
    let v2: s0 = v0.p0
    let v4: s0 = v5.p0
    var v3: s3 = v5
    let v6: s0 = f117(v2)
    let v29: s0 = f90(v6)
    var v16: s3 = v3
    let v20: s2 = v0.p1
    let v19: s0 = f117(v29)
    let v33: [[Double]] = v4.p0
    v16.p1 = v20
    var v50: s0 = v29
    let v51: s0 = f90(v50)
    v50.p0 = v33
    let v92: s0 = f89(v19)
    var v75: s3 = v16
    v5.p0 = v51
    v75.p0 = v92
    return v75
  }
  func f86(_ v0: s10) -> s10 {
    let v7: s10 = f110(v0)
    let v2: s4 = v0.p0
    let v1: s4 = v0.p0
    let v4: [s3] = v7.p1
    let v8: [s3] = v7.p1
    let v5: s10 = f110(v0)
    var v10: s10 = v5
    v10.p0 = v1
    var v11: [s3] = v4
    v10.p0 = v2
    let v23: s10 = s10(p0: v1, p1: v8)
    let v13: s3 = v11[1]
    let v18: s3 = f87(v13)
    let v22: s10 = f110(v10)
    let v28: s3 = v1.p0
    v10.p1 = v11
    v10.p1 = v4
    v11[1] = v18
    v10 = v23
    v11[2] = v28
    return v22
  }
  func f81(_ v0: [s6]) -> [s6] {
    let v5: s6 = v0[0]
    let v28: s6 = v0[0]
    let v35: s6 = v0[0]
    var v47: [s6] = v0
    v47[0] = v35
    v47[0] = v28
    v47[0] = v5
    return v47
  }
  func f69(_ v0: Double) -> Double {
    var v3: Double = v0
    var v4: Double = v0
    let v5: [Double] = [v4, v4, v3]
    var v2: [Double] = v5
    var v10: Double = v4
    var v14: [Double] = v2
    v2[1] = v10
    v2[2] = v0
    var v13: [Double] = v5
    var v24: [Double] = v5
    let v11: Double = v24[1]
    v24[0] = v3
    let v20: Double = v13[2]
    v13[0] = v10
    var v16: Double = v20
    let v19: Double = v5[0]
    v13[1] = v3
    var v38: [Double] = v24
    var v22: Double = v16
    v13[2] = v22
    v13[1] = v4
    let v23: Double = v14[1]
    v24 = v13
    v38[1] = v3
    let v54: Double = v24[0]
    v38[1] = v54
    v38[1] = v10
    v38[2] = v23
    var v73: [Double] = v38
    v13[2] = v11
    v13 = v24
    let v87: Double = v73[2]
    v73[1] = v19
    v24[1] = v22
    return v87
  }
  func f43(_ v0: [[s6]]) -> [[s6]] {
    let v3: [s6] = v0[0]
    let v7: [s6] = f81(v3)
    let v4: [s6] = f81(v7)
    var v14: [[s6]] = v0
    v14[0] = v4
    v14[0] = v7
    var v21: [[s6]] = v14
    var v18: [[s6]] = v21
    let v32: [[[s6]]] = [v18, v14, v14, v18, v0, v21]
    let v43: [[s6]] = v32[2]
    return v43
  }
  func f36(_ v0: s7) -> s7 {
    var v3: s7 = v0
    let v1: [[s0]] = v0.p0
    let v2: [[s0]] = v0.p0
    let v11: [s0] = v1[0]
    let v7: [[s6]] = v3.p1
    v3.p0 = v2
    let v5: s0 = v11[0]
    let v8: [[s0]] = [v11, v11, v11, v11, v11, v11, v11]
    var v12: [[s0]] = v2
    v3.p1 = v7
    var v29: s0 = v5
    let v18: [s0] = v8[5]
    let v51: s0 = f90(v29)
    let v42: [[Double]] = v51.p0
    v29.p0 = v42
    var v43: [s0] = v18
    let v40: [s0] = v12[0]
    v43[0] = v51
    v12[0] = v40
    let v54: [[s6]] = f43(v7)
    v12[0] = v43
    v3.p0 = v12
    let v93: s7 = s7(p0: v12, p1: v54)
    return v93
  }
  func f13(_ v0: Double) -> Double {
    let v8: Double = v0 * v0
    let v4: Double = f69(v8)
    var v2: Double = v4
    let v10: Double = f69(v4)
    let v1: Double = f69(v10)
    var v18: Double = v8
    var v11: Double = v4
    let v15: Double = f69(v1)
    v18 = v8
    let v9: Double = f69(v8)
    let v23: [Double] = [v8, v11, v1, v18]
    var v31: [Double] = v23
    let v29: Double = f69(v2)
    v31[0] = v15
    let v16: Double = v31[2]
    let v33: Double = f69(v16)
    v31[2] = v16
    var v35: [Double] = v23
    var v44: [Double] = v31
    v2 = v16
    let v43: Double = f69(v10)
    v44[1] = v43
    let v41: Double = v23[3]
    var v64: [Double] = v44
    let v91: Double = v64[0]
    let v49: Double = v41 - v29
    let v60: Double = f69(v33)
    let v115: Double = f69(v9)
    v31[3] = v91
    var v68: [Double] = v35
    v44 = v68
    let v96: Double = f69(v49)
    v64[3] = v115
    let v143: Double = v35[3]
    var v110: [Double] = v64
    let v106: [Double] = [v143, v96]
    let v190: Double = v106[0]
    v31[0] = v60
    v35 = v110
    return v190
  }
  func f8(_ v0: s10, _ v1: s7) -> s7 {
    let v5: s7 = f36(v1)
    var v7: s7 = v1
    let v4: [[s6]] = v7.p1
    let v10: [[s6]] = f43(v4)
    let v11: [[s0]] = v5.p0
    var v19: s7 = v1
    var v24: s7 = v19
    v7.p0 = v11
    let v51: [[s0]] = v1.p0
    let v152: s7 = f93(v24)
    v7.p1 = v10
    v19.p1 = v10
    v7.p0 = v51
    let v128: s7 = f93(v152)
    return v128
  }
  @inline(never)
  func f0(_ v0: [s7], _ v1: s10, _ v2: Double) -> Double {
    var v4: [s7] = v0
    var v6: [s7] = v4
    var v5: [s7] = v0
    let v3: s10 = f86(v1)
    let v13: s7 = v4[1]
    let v10: s7 = f8(v3, v13)
    let v20: [[s6]] = v10.p1
    v6[1] = v10
    v6[0] = v13
    v4 = v0
    let v78: [s6] = v20[0]
    let v25: Double = f69(v2)
    let v45: s6 = v78[0]
    let v58: [s6] = v20[0]
    let v93: s6 = v58[0]
    var v43: [s6] = v58
    let v39: Double = v25 / v25
    let v32: s7 = v6[0]
    v43[0] = v45
    let v27: Double = f13(v39)
    v4[0] = v32
    v4 = v5
    let v59: s6 = v43[0]
    let v97: [s6] = v20[0]
    var v95: s6 = v93
    var v121: [s6] = v97
    v43[0] = v45
    v121[0] = v95
    let v146: s6 = v121[0]
    v43[0] = v146
    v5[0] = v32
    let v203: Double = v59.p0
    let v410: Double = f69(v203)
    let v242: Double = v27 - v410
    return v242
  }
  func benchmark() {
    let v0: [s7] = [s7(p0: [[s0(p0: [[0.0], [1.0]])]], p1: [[s6(p0: 2.0, p1: [s2(p0: s1(p0: s0(p0: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0]]), s0(p0: [[7.0], [8.0]]), s0(p0: [[9.0], [10.0]])]), p1: [s1(p0: s0(p0: [[11.0], [12.0]]), p1: [s0(p0: [[13.0], [14.0]]), s0(p0: [[15.0], [16.0]]), s0(p0: [[17.0], [18.0]])]), s1(p0: s0(p0: [[19.0], [20.0]]), p1: [s0(p0: [[21.0], [22.0]]), s0(p0: [[23.0], [24.0]]), s0(p0: [[25.0], [26.0]])])]), s2(p0: s1(p0: s0(p0: [[27.0], [28.0]]), p1: [s0(p0: [[29.0], [30.0]]), s0(p0: [[31.0], [32.0]]), s0(p0: [[33.0], [34.0]])]), p1: [s1(p0: s0(p0: [[35.0], [36.0]]), p1: [s0(p0: [[37.0], [38.0]]), s0(p0: [[39.0], [40.0]]), s0(p0: [[41.0], [42.0]])]), s1(p0: s0(p0: [[43.0], [44.0]]), p1: [s0(p0: [[45.0], [46.0]]), s0(p0: [[47.0], [48.0]]), s0(p0: [[49.0], [50.0]])])]), s2(p0: s1(p0: s0(p0: [[51.0], [52.0]]), p1: [s0(p0: [[53.0], [54.0]]), s0(p0: [[55.0], [56.0]]), s0(p0: [[57.0], [58.0]])]), p1: [s1(p0: s0(p0: [[59.0], [60.0]]), p1: [s0(p0: [[61.0], [62.0]]), s0(p0: [[63.0], [64.0]]), s0(p0: [[65.0], [66.0]])]), s1(p0: s0(p0: [[67.0], [68.0]]), p1: [s0(p0: [[69.0], [70.0]]), s0(p0: [[71.0], [72.0]]), s0(p0: [[73.0], [74.0]])])])])]]), s7(p0: [[s0(p0: [[75.0], [76.0]])]], p1: [[s6(p0: 77.0, p1: [s2(p0: s1(p0: s0(p0: [[78.0], [79.0]]), p1: [s0(p0: [[80.0], [81.0]]), s0(p0: [[82.0], [83.0]]), s0(p0: [[84.0], [85.0]])]), p1: [s1(p0: s0(p0: [[86.0], [87.0]]), p1: [s0(p0: [[88.0], [89.0]]), s0(p0: [[90.0], [91.0]]), s0(p0: [[92.0], [93.0]])]), s1(p0: s0(p0: [[94.0], [95.0]]), p1: [s0(p0: [[96.0], [97.0]]), s0(p0: [[98.0], [99.0]]), s0(p0: [[100.0], [101.0]])])]), s2(p0: s1(p0: s0(p0: [[102.0], [103.0]]), p1: [s0(p0: [[104.0], [105.0]]), s0(p0: [[106.0], [107.0]]), s0(p0: [[108.0], [109.0]])]), p1: [s1(p0: s0(p0: [[110.0], [111.0]]), p1: [s0(p0: [[112.0], [113.0]]), s0(p0: [[114.0], [115.0]]), s0(p0: [[116.0], [117.0]])]), s1(p0: s0(p0: [[118.0], [119.0]]), p1: [s0(p0: [[120.0], [121.0]]), s0(p0: [[122.0], [123.0]]), s0(p0: [[124.0], [125.0]])])]), s2(p0: s1(p0: s0(p0: [[126.0], [127.0]]), p1: [s0(p0: [[128.0], [129.0]]), s0(p0: [[130.0], [131.0]]), s0(p0: [[132.0], [133.0]])]), p1: [s1(p0: s0(p0: [[134.0], [135.0]]), p1: [s0(p0: [[136.0], [137.0]]), s0(p0: [[138.0], [139.0]]), s0(p0: [[140.0], [141.0]])]), s1(p0: s0(p0: [[142.0], [143.0]]), p1: [s0(p0: [[144.0], [145.0]]), s0(p0: [[146.0], [147.0]]), s0(p0: [[148.0], [149.0]])])])])]])]
    let v1: s10 = s10(p0: s4(p0: s3(p0: s0(p0: [[150.0], [151.0]]), p1: s2(p0: s1(p0: s0(p0: [[152.0], [153.0]]), p1: [s0(p0: [[154.0], [155.0]]), s0(p0: [[156.0], [157.0]]), s0(p0: [[158.0], [159.0]])]), p1: [s1(p0: s0(p0: [[160.0], [161.0]]), p1: [s0(p0: [[162.0], [163.0]]), s0(p0: [[164.0], [165.0]]), s0(p0: [[166.0], [167.0]])]), s1(p0: s0(p0: [[168.0], [169.0]]), p1: [s0(p0: [[170.0], [171.0]]), s0(p0: [[172.0], [173.0]]), s0(p0: [[174.0], [175.0]])])])), p1: s0(p0: [[176.0], [177.0]])), p1: [s3(p0: s0(p0: [[178.0], [179.0]]), p1: s2(p0: s1(p0: s0(p0: [[180.0], [181.0]]), p1: [s0(p0: [[182.0], [183.0]]), s0(p0: [[184.0], [185.0]]), s0(p0: [[186.0], [187.0]])]), p1: [s1(p0: s0(p0: [[188.0], [189.0]]), p1: [s0(p0: [[190.0], [191.0]]), s0(p0: [[192.0], [193.0]]), s0(p0: [[194.0], [195.0]])]), s1(p0: s0(p0: [[196.0], [197.0]]), p1: [s0(p0: [[198.0], [199.0]]), s0(p0: [[200.0], [201.0]]), s0(p0: [[202.0], [203.0]])])])), s3(p0: s0(p0: [[204.0], [205.0]]), p1: s2(p0: s1(p0: s0(p0: [[206.0], [207.0]]), p1: [s0(p0: [[208.0], [209.0]]), s0(p0: [[210.0], [211.0]]), s0(p0: [[212.0], [213.0]])]), p1: [s1(p0: s0(p0: [[214.0], [215.0]]), p1: [s0(p0: [[216.0], [217.0]]), s0(p0: [[218.0], [219.0]]), s0(p0: [[220.0], [221.0]])]), s1(p0: s0(p0: [[222.0], [223.0]]), p1: [s0(p0: [[224.0], [225.0]]), s0(p0: [[226.0], [227.0]]), s0(p0: [[228.0], [229.0]])])])), s3(p0: s0(p0: [[230.0], [231.0]]), p1: s2(p0: s1(p0: s0(p0: [[232.0], [233.0]]), p1: [s0(p0: [[234.0], [235.0]]), s0(p0: [[236.0], [237.0]]), s0(p0: [[238.0], [239.0]])]), p1: [s1(p0: s0(p0: [[240.0], [241.0]]), p1: [s0(p0: [[242.0], [243.0]]), s0(p0: [[244.0], [245.0]]), s0(p0: [[246.0], [247.0]])]), s1(p0: s0(p0: [[248.0], [249.0]]), p1: [s0(p0: [[250.0], [251.0]]), s0(p0: [[252.0], [253.0]]), s0(p0: [[254.0], [255.0]])])]))])
    let v2: Double = 256.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 256.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
