  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    var v6: Double = v1
    let v5: Double = v6 + v6
    let v15: [Double] = [v5, v6, v6, v5]
    var v9: Double = v5
    var v18: [Double] = v15
    var v21: [Double] = v18
    var v45: [Double] = v21
    v21[3] = v9
    v21 = v18
    v18 = v21
    var v69: [Double] = v45
    let v78: Double = v69[2]
    return v78
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s1(p0: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])]], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])))], [s2(p0: s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), p1: s1(p0: [[s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])))]]
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
