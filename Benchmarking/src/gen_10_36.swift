  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [Double]
  }
  struct s2 {
    var p0: s1
    var p1: [[s1]]
  }
  struct s3 {
    var p0: [[s2]]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: s0, _ v2: Double) -> Double {
    let v8: [[Double]] = v1.p1
    let v9: [Double] = v8[0]
    let v3: Double = v9[0]
    let v18: [[Double]] = v1.p1
    let v10: Double = v9[0]
    let v22: [Double] = v18[0]
    let v34: Double = v22[0]
    let v63: Double = v2 * v10
    let v102: Double = v63 - v3
    var v104: Double = v34
    let v145: Double = v102 / v104
    return v145
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: [[s2(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [4.0, 5.0]), p1: [[s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0]]), p1: [10.0, 11.0])]])], [s2(p0: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: [16.0, 17.0]), p1: [[s1(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0]]), p1: [22.0, 23.0])]])]], p1: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])])]]
    let v1: s0 = s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
