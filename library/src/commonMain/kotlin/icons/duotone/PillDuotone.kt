package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PillDuotone: ImageVector
    get() {
        if (_PillDuotone != null) {
            return _PillDuotone!!
        }
        _PillDuotone = ImageVector.Builder(
            name = "Duotone.PillDuotone",
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
                moveTo(109.25f, 210.75f)
                arcToRelative(45.26f, 45.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(45.26f, 45.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -64f)
                lineTo(96f, 96f)
                lineToRelative(64f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(45.25f, 146.75f)
                lineTo(146.75f, 45.25f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.74f, 45.25f)
                lineTo(210.75f, 45.26f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.75f, 109.25f)
                lineTo(109.25f, 210.75f)
                arcTo(45.25f, 45.25f, 73.15f, isMoreThanHalf = false, isPositiveArc = true, 45.26f, 210.75f)
                lineTo(45.25f, 210.75f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45.25f, 146.75f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                lineTo(160f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 112f)
                lineTo(184f, 88f)
            }
        }.build()

        return _PillDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PillDuotone: ImageVector? = null
