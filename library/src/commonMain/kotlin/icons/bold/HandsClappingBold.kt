package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.HandsClappingBold: ImageVector
    get() {
        if (_HandsClappingBold != null) {
            return _HandsClappingBold!!
        }
        _HandsClappingBold = ImageVector.Builder(
            name = "Bold.HandsClappingBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(83.54f, 87f)
                lineTo(77.81f, 77f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, 46.63f, 95f)
                lineToRelative(19f, 32.91f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.55f, 132f)
                lineToRelative(-26f, -45f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = true, 31.17f, -18f)
                lineToRelative(36.45f, 63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(102f, 47f)
                lineTo(96.28f, 37f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, 65.1f, 55f)
                lineTo(77.81f, 77f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.71f, 69f)
                lineTo(102f, 47f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = true, 31.17f, -18f)
                lineToRelative(37f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(199f, 175.76f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.7f, -86.19f)
                lineTo(188.61f, 53f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -31.18f, 18f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(81.81f, 156f)
                lineTo(61.59f, 121f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, -31.18f, 18f)
                lineTo(40f, 155.59f)
                lineTo(65.63f, 200f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124.71f, -72f)
                lineToRelative(-20.2f, -35f)
                arcTo(18f, 18f, 0f, isMoreThanHalf = true, isPositiveArc = false, 139f, 111f)
            }
        }.build()

        return _HandsClappingBold!!
    }

@Suppress("ObjectPropertyName")
private var _HandsClappingBold: ImageVector? = null
