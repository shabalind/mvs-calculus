  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: [[s2]], _ v2: Double) -> Double {
    var v7: [[s2]] = v1
    let v8: [s2] = v7[0]
    let v3: [s0] = v0[0]
    let v16: s2 = v8[0]
    var v18: s2 = v16
    let v31: s0 = v18.p0
    v18.p1 = v3
    let v28: [[Double]] = v31.p1
    let v43: [Double] = v28[1]
    var v96: [Double] = v43
    var v87: [Double] = v96
    let v207: Double = v87[0]
    return v207
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]]
    let v1: [[s2]] = [[s2(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]), p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])])], [s2(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])])], [s2(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])])]]
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
