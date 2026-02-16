package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CloudCheckDuotone: ImageVector
    get() {
        if (_CloudCheckDuotone != null) {
            return _CloudCheckDuotone!!
        }
        _CloudCheckDuotone = ImageVector.Builder(
            name = "Duotone.CloudCheckDuotone",
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
                moveTo(160f, 48f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 85.9f, 97.84f)
                lineToRelative(0f, -0.1f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 208f)
                horizontalLineToRelative(88f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 128f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 80f)
                horizontalLineTo(72f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.92f, 97.74f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 136f)
                lineToRelative(24f, 24f)
                lineToRelative(48f, -48f)
            }
        }.build()

        return _CloudCheckDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCheckDuotone: ImageVector? = null
