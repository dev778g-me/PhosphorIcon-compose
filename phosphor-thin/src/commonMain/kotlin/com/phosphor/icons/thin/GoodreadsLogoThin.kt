package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.GoodreadsLogoThin: ImageVector
    get() {
        if (_GoodreadsLogoThin != null) {
            return _GoodreadsLogoThin!!
        }
        _GoodreadsLogoThin = ImageVector.Builder(
            name = "Thin.GoodreadsLogoThin",
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
                moveTo(72f, 88f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 0f)
                verticalLineToRelative(24f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -112f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 32f)
                verticalLineTo(168f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
                curveToRelative(-19f, 0f, -37.88f, -9.49f, -48f, -24f)
            }
        }.build()

        return _GoodreadsLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _GoodreadsLogoThin: ImageVector? = null
