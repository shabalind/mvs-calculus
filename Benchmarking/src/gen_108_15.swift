  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [[s1]], _ v2: Double) -> Double {
    let v7: s1 = v0[2]
    let v3: s0 = v7.p0
    let v20: [[Double]] = v3.p1
    var v10: s0 = v3
    let v15: [[Double]] = v3.p1
    v10.p1 = v15
    let v18: [[Double]] = v10.p0
    v10.p1 = v15
    let v23: [Double] = v18[0]
    v10.p1 = v20
    let v47: Double = v23[0]
    return v47
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]), s1(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])]), s1(p0: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]]), p1: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])])]
    let v1: [[s1]] = [[s1(p0: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), p1: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])])]]
    let v2: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
