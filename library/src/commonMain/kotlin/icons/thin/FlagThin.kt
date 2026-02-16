package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.FlagThin: ImageVector
    get() {
        if (_FlagThin != null) {
            return _FlagThin!!
        }
        _FlagThin = ImageVector.Builder(
            name = "Thin.FlagThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 224f)
                lineTo(48f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 176f)
                curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
                verticalLineTo(56f)
                curveTo(160f, 111.43f, 112f, 0.57f, 48f, 56f)
            }
        }.build()

        return _FlagThin!!
    }

@Suppress("ObjectPropertyName")
private var _FlagThin: ImageVector? = null
