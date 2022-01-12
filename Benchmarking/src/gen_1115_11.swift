  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s1
  }
  struct s5 {
    var p0: [s2]
    var p1: s0
  }
  func f31(_ v0: Double) -> Double {
    var v2: Double = v0
    v2 = v0
    var v1: Double = v0
    var v3: Double = v0
    let v5: Double = v0 + v2
    let v11: Double = v1 * v5
    var v20: Double = v11
    var v32: Double = v20
    let v10: [Double] = [v32, v3, v0]
    var v41: [Double] = v10
    var v31: [Double] = v41
    var v51: [Double] = v31
    v20 = v3
    let v26: Double = v51[1]
    v31[1] = v5
    return v26
  }
  func f29(_ v0: Double) -> Double {
    let v6: Double = f31(v0)
    var v1: Double = v6
    var v2: Double = v0
    let v8: [Double] = [v6, v0]
    var v10: Double = v2
    var v4: [Double] = v8
    v4[0] = v10
    let v7: Double = f31(v6)
    v2 = v1
    v2 = v7
    var v25: [Double] = v4
    let v28: Double = v25[1]
    let v33: Double = f31(v28)
    v25[0] = v0
    return v33
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: s2, _ v2: Double) -> Double {
    var v8: Double = v2
    v8 = v2
    let v61: Double = f29(v8)
    var v236: Double = v61
    return v236
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: [s2(p0: [[s0(p0: [[0.0]])]], p1: s1(p0: s0(p0: [[1.0]]), p1: s0(p0: [[2.0]]))), s2(p0: [[s0(p0: [[3.0]])]], p1: s1(p0: s0(p0: [[4.0]]), p1: s0(p0: [[5.0]]))), s2(p0: [[s0(p0: [[6.0]])]], p1: s1(p0: s0(p0: [[7.0]]), p1: s0(p0: [[8.0]])))], p1: s0(p0: [[9.0]]))]
    let v1: s2 = s2(p0: [[s0(p0: [[10.0]])]], p1: s1(p0: s0(p0: [[11.0]]), p1: s0(p0: [[12.0]])))
    let v2: Double = 13.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 13.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
