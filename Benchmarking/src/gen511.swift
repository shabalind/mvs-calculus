  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  func f24(_ v0: Double) -> Double {
    let v7: [Double] = [v0, v0]
    let v2: Double = v7[1]
    var v6: Double = v2
    let v11: Double = v6 / v0
    let v3: Double = v7[1]
    let v8: Double = v7[1]
    let v12: Double = v7[1]
    var v15: [Double] = v7
    var v10: [Double] = v15
    v15[0] = v8
    let v9: Double = v7[1]
    v10[1] = v11
    var v16: [Double] = v10
    var v43: [Double] = v16
    v15[0] = v3
    v43[0] = v12
    let v46: Double = v43[0]
    let v27: Double = v16[0]
    var v71: [Double] = v43
    var v34: [Double] = v7
    v71[1] = v9
    var v41: [Double] = v43
    var v39: [Double] = v16
    let v47: Double = v41[0]
    v39[0] = v27
    v16[1] = v12
    v15[0] = v0
    var v38: [Double] = v43
    v39 = v16
    var v26: [Double] = v34
    let v79: [[Double]] = [v39, v38, v16]
    v38[0] = v46
    v43 = v16
    v43 = v10
    let v50: [[[Double]]] = [v79, v79, v79, v79, v79, v79]
    var v83: [[[Double]]] = v50
    v34 = v71
    var v101: [Double] = v39
    v16 = v26
    var v62: [[[Double]]] = v83
    var v45: [[Double]] = v79
    var v74: [[[Double]]] = v62
    let v40: [Double] = v45[1]
    v71[0] = v47
    let v61: Double = v101[1]
    let v82: Double = v40[0]
    v10[0] = v3
    v41[0] = v0
    v34[1] = v61
    let v109: [[Double]] = v74[1]
    v45 = v109
    return v82
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    var v2: Double = v1
    let v14: Double = f24(v2)
    var v11: Double = v1
    let v160: Double = v14 / v11
    return v160
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: [[s0(p0: [[3.0], [4.0]], p1: [[5.0]])]]), p1: [s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])])]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
