package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SubtractDuotone: ImageVector
    get() {
        if (_SubtractDuotone != null) {
            return _SubtractDuotone!!
        }
        _SubtractDuotone = ImageVector.Builder(
            name = "Duotone.SubtractDuotone",
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
                moveTo(167.6f, 88.4f)
                horizontalLineToRelative(0f)
                arcTo(73.37f, 73.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 96f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, 72f)
                arcToRelative(73.37f, 73.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.6f, -0.4f)
                horizontalLineToRelative(0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 79.2f, -79.2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                moveToRelative(-72f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 144f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -144f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(167.6f, 88.4f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -79.2f, 79.2f)
            }
        }.build()

        return _SubtractDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SubtractDuotone: ImageVector? = null
