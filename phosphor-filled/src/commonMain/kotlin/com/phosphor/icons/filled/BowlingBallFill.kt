package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BowlingBallFill: ImageVector
    get() {
        if (_BowlingBallFill != null) {
            return _BowlingBallFill!!
        }
        _BowlingBallFill = ImageVector.Builder(
            name = "Filled.BowlingBallFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(132f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 132f, 128f)
                close()
                moveTo(152f, 92f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 92f)
                close()
                moveTo(172f, 144f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 144f)
                close()
            }
        }.build()

        return _BowlingBallFill!!
    }

@Suppress("ObjectPropertyName")
private var _BowlingBallFill: ImageVector? = null
