package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.NumberThreeThin: ImageVector
    get() {
        if (_NumberThreeThin != null) {
            return _NumberThreeThin!!
        }
        _NumberThreeThin = ImageVector.Builder(
            name = "Thin.NumberThreeThin",
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
                moveTo(88f, 48f)
                horizontalLineToRelative(80f)
                lineToRelative(-48f, 64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 83.78f)
            }
        }.build()

        return _NumberThreeThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberThreeThin: ImageVector? = null
