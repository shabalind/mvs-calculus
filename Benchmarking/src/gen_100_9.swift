  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
  }
  struct s6 {
    var p0: s3
    var p1: [s3]
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: [[s6]], _ v2: Double) -> Double {
    let v5: s3 = v0.p0
    let v34: [s0] = v5.p0
    let v26: s0 = v34[0]
    let v40: [[Double]] = v26.p1
    var v74: [[Double]] = v40
    let v38: [Double] = v74[1]
    let v44: Double = v38[0]
    v74[0] = v38
    v74[1] = v38
    v74[1] = v38
    let v86: [Double] = v74[2]
    let v102: [Double] = v74[0]
    v74[1] = v102
    var v83: [Double] = v86
    let v111: Double = v83[0]
    v83[0] = v44
    return v111
  }
  func benchmark() {
    let v0: s6 = s6(p0: s3(p0: [s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]])], p1: s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]])), p1: [s3(p0: [s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]])], p1: s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]])), s3(p0: [s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]])], p1: s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]]))])
    let v1: [[s6]] = [[s6(p0: s3(p0: [s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]])], p1: s0(p0: [35.0, 36.0], p1: [[37.0], [38.0], [39.0]])), p1: [s3(p0: [s0(p0: [40.0, 41.0], p1: [[42.0], [43.0], [44.0]])], p1: s0(p0: [45.0, 46.0], p1: [[47.0], [48.0], [49.0]])), s3(p0: [s0(p0: [50.0, 51.0], p1: [[52.0], [53.0], [54.0]])], p1: s0(p0: [55.0, 56.0], p1: [[57.0], [58.0], [59.0]]))])], [s6(p0: s3(p0: [s0(p0: [60.0, 61.0], p1: [[62.0], [63.0], [64.0]])], p1: s0(p0: [65.0, 66.0], p1: [[67.0], [68.0], [69.0]])), p1: [s3(p0: [s0(p0: [70.0, 71.0], p1: [[72.0], [73.0], [74.0]])], p1: s0(p0: [75.0, 76.0], p1: [[77.0], [78.0], [79.0]])), s3(p0: [s0(p0: [80.0, 81.0], p1: [[82.0], [83.0], [84.0]])], p1: s0(p0: [85.0, 86.0], p1: [[87.0], [88.0], [89.0]]))])]]
    let v2: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
