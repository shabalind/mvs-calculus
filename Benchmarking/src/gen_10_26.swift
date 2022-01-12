  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s5 {
    var p0: s1
    var p1: [s1]
    var p2: [[s0]]
  }
  func f43(_ v0: Double) -> Double {
    var v3: Double = v0
    var v7: Double = v0
    let v6: [Double] = [v0, v0, v7, v3, v3, v0]
    var v2: [Double] = v6
    let v9: Double = v2[1]
    return v9
  }
  func f9(_ v0: Double) -> Double {
    var v12: Double = v0
    var v8: Double = v12
    return v8
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: s5, _ v2: Double) -> Double {
    var v11: Double = v2
    var v48: Double = v2
    let v28: Double = f9(v11)
    var v29: Double = v11
    let v39: Double = f9(v28)
    let v70: Double = f43(v39)
    let v56: Double = v48 - v70
    v11 = v29
    return v56
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])])], [s1(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])])]]
    let v1: s5 = s5(p0: s1(p0: s0(p0: [[12.0]], p1: [[13.0]]), p1: [s0(p0: [[14.0]], p1: [[15.0]]), s0(p0: [[16.0]], p1: [[17.0]])]), p1: [s1(p0: s0(p0: [[18.0]], p1: [[19.0]]), p1: [s0(p0: [[20.0]], p1: [[21.0]]), s0(p0: [[22.0]], p1: [[23.0]])])], p2: [[s0(p0: [[24.0]], p1: [[25.0]])], [s0(p0: [[26.0]], p1: [[27.0]])]])
    let v2: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
