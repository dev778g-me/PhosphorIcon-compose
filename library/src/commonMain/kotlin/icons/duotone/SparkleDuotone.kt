package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SparkleDuotone: ImageVector
    get() {
        if (_SparkleDuotone != null) {
            return _SparkleDuotone!!
        }
        _SparkleDuotone = ImageVector.Builder(
            name = "Duotone.SparkleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(84.27f, 171.73f)
                lineToRelative(-55.09f, -20.3f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -14.86f)
                lineToRelative(55.09f, -20.3f)
                lineToRelative(20.3f, -55.09f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.86f, 0f)
                lineToRelative(20.3f, 55.09f)
                lineToRelative(55.09f, 20.3f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.86f)
                lineToRelative(-55.09f, 20.3f)
                lineToRelative(-20.3f, 55.09f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84.27f, 171.73f)
                lineToRelative(-55.09f, -20.3f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -14.86f)
                lineToRelative(55.09f, -20.3f)
                lineToRelative(20.3f, -55.09f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.86f, 0f)
                lineToRelative(20.3f, 55.09f)
                lineToRelative(55.09f, 20.3f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.86f)
                lineToRelative(-55.09f, 20.3f)
                lineToRelative(-20.3f, 55.09f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 16f)
                lineTo(176f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 72f)
                lineTo(224f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 40f)
                lineTo(200f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 88f)
                lineTo(240f, 88f)
            }
        }.build()

        return _SparkleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SparkleDuotone: ImageVector? = null
