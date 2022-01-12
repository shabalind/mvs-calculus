  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f15(_ v0: Double) -> Double {
    var v4: Double = v0
    var v6: Double = v0
    var v2: Double = v4
    let v3: Double = v6 * v2
    var v1: Double = v3
    var v12: Double = v1
    var v16: Double = v12
    return v16
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v7: Double = f15(v1)
    let v13: Double = v1 + v7
    var v36: Double = v13
    return v36
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]), s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]])])], [s1(p0: s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]]), p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]]), s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]]), s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]])])]]
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
