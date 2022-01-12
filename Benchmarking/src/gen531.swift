  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: Double
  }
  struct s2 {
    var p0: [s1]
  }
  struct s4 {
    var p0: s1
    var p1: s2
  }
  struct s8 {
    var p0: s0
    var p1: s4
  }
  func f24(_ v0: Double) -> Double {
    let v1: [Double] = [v0]
    var v5: Double = v0
    let v3: Double = v1[0]
    var v8: [Double] = v1
    var v7: [Double] = v8
    var v2: [Double] = v8
    v2[0] = v0
    var v9: Double = v3
    let v6: Double = v1[0]
    v2[0] = v6
    var v4: [Double] = v7
    let v13: Double = v8[0]
    var v34: [Double] = v4
    var v18: [Double] = v8
    let v12: Double = v4[0]
    var v17: Double = v6
    v8[0] = v12
    let v23: Double = v34[0]
    var v16: Double = v13
    let v31: Double = v2[0]
    v34[0] = v13
    v8[0] = v5
    v18[0] = v31
    let v27: Double = v18[0]
    v8 = v4
    v18[0] = v27
    let v14: [Double] = [v17, v27]
    var v28: [Double] = v4
    v4[0] = v16
    var v40: [Double] = v28
    var v37: [Double] = v2
    v7[0] = v0
    let v22: Double = v18[0]
    var v59: [Double] = v40
    var v79: [Double] = v14
    var v41: Double = v22
    let v38: Double = v2[0]
    v8[0] = v6
    let v35: Double = v79[0]
    let v89: Double = v7[0]
    let v119: [[Double]] = [v59, v37, v40, v34, v7]
    v7[0] = v27
    v7[0] = v35
    v4[0] = v89
    v2[0] = v41
    v37[0] = v38
    v34[0] = v27
    v34[0] = v23
    var v51: [Double] = v14
    let v117: [Double] = v119[2]
    v8[0] = v12
    let v63: Double = v51[0]
    v37[0] = v63
    v2[0] = v9
    v40[0] = v13
    v40[0] = v35
    v51[0] = v38
    let v125: Double = v117[0]
    return v125
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: Double) -> Double {
    let v8: s8 = v0[1]
    let v2: s0 = v8.p0
    let v13: [[Double]] = v2.p0
    let v15: [Double] = v13[0]
    let v73: Double = v15[0]
    let v45: Double = f24(v73)
    let v48: Double = f24(v45)
    return v48
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s4(p0: s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), p1: 10.0), p1: s2(p0: [s1(p0: s0(p0: [[11.0], [12.0]], p1: [[13.0], [14.0], [15.0]]), p1: 16.0)]))), s8(p0: s0(p0: [[17.0], [18.0]], p1: [[19.0], [20.0], [21.0]]), p1: s4(p0: s1(p0: s0(p0: [[22.0], [23.0]], p1: [[24.0], [25.0], [26.0]]), p1: 27.0), p1: s2(p0: [s1(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0], [32.0]]), p1: 33.0)]))), s8(p0: s0(p0: [[34.0], [35.0]], p1: [[36.0], [37.0], [38.0]]), p1: s4(p0: s1(p0: s0(p0: [[39.0], [40.0]], p1: [[41.0], [42.0], [43.0]]), p1: 44.0), p1: s2(p0: [s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), p1: 50.0)])))]
    let v1: Double = 51.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 51.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
