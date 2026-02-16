package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.MoneyWavyDuotone: ImageVector
    get() {
        if (_MoneyWavyDuotone != null) {
            return _MoneyWavyDuotone!!
        }
        _MoneyWavyDuotone = ImageVector.Builder(
            name = "Duotone.MoneyWavyDuotone",
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
                moveTo(16f, 69.21f)
                verticalLineToRelative(120f)
                curveToRelative(91.64f, -44.77f, 132.36f, 42.35f, 224f, -2.42f)
                verticalLineToRelative(-120f)
                curveTo(148.36f, 111.56f, 107.64f, 24.44f, 16f, 69.21f)
                close()
                moveTo(128f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 186.79f)
                curveToRelative(-91.64f, 44.77f, -132.36f, -42.35f, -224f, 2.42f)
                verticalLineToRelative(-120f)
                curveToRelative(91.64f, -44.77f, 132.36f, 42.35f, 224f, -2.42f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 96f)
                lineTo(48f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 112f)
                lineTo(208f, 160f)
            }
        }.build()

        return _MoneyWavyDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyWavyDuotone: ImageVector? = null
