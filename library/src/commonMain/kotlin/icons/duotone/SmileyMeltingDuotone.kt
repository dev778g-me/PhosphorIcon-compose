package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.SmileyMeltingDuotone: ImageVector
    get() {
        if (_SmileyMeltingDuotone != null) {
            return _SmileyMeltingDuotone!!
        }
        _SmileyMeltingDuotone = ImageVector.Builder(
            name = "Duotone.SmileyMeltingDuotone",
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
                moveTo(56.44f, 192f)
                arcTo(95.67f, 95.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 126.06f)
                curveTo(33f, 74.58f, 75.15f, 32.73f, 126.63f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.93f, 160f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(164f, 140f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(116f, 92f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56.44f, 192f)
                arcTo(95.67f, 95.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 126.06f)
                curveTo(33f, 74.58f, 75.15f, 32.73f, 126.63f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.93f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 240f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
                horizontalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                horizontalLineTo(136f)
                curveToRelative(-26.51f, 0f, -56f, -21.49f, -56f, -48f)
                arcToRelative(49f, 49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, -8f)
            }
        }.build()

        return _SmileyMeltingDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyMeltingDuotone: ImageVector? = null
