package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.FlagPennantThin: ImageVector
    get() {
        if (_FlagPennantThin != null) {
            return _FlagPennantThin!!
        }
        _FlagPennantThin = ImageVector.Builder(
            name = "Thin.FlagPennantThin",
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
                moveTo(56f, 168f)
                lineToRelative(184f, -64f)
                lineToRelative(-184f, -64f)
                lineToRelative(0f, 176f)
            }
        }.build()

        return _FlagPennantThin!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennantThin: ImageVector? = null
